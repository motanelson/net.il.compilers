import java.util.*;

public class ILToX86Compiler extends ilBaseVisitor<Void> {

    private StringBuilder asm = new StringBuilder();
    private int labelCounter = 0;

    public String getCode() {
        return asm.toString();
    }

    // ==========================
    // Programa
    // ==========================
    @Override
    public Void visitPrograma(ilParser.ProgramaContext ctx) {

        asm.append("section .text\n");
        asm.append("global _start\n\n");
        asm.append("_start:\n");

        visitChildren(ctx);

        return null;
    }

    // ==========================
    // Método
    // ==========================
    @Override
    public Void visitMetodo(ilParser.MetodoContext ctx) {

        asm.append("    push ebp\n");
        asm.append("    mov ebp, esp\n");
        asm.append("    sub esp, 64\n"); // espaço locais

        visitChildren(ctx);

        asm.append("    mov esp, ebp\n");
        asm.append("    pop ebp\n");
        asm.append("    ret\n");

        return null;
    }

    // ==========================
    // Stack ops
    // ==========================
    @Override
    public Void visitInstrucaoStack(ilParser.InstrucaoStackContext ctx) {

        String text = ctx.getText();

        if (text.startsWith("ldc")) {
            String val = ctx.NUMERO().getText();
            asm.append("    mov eax, ").append(val).append("\n");
            asm.append("    push eax\n");
        }

        else if (text.startsWith("ldloc")) {
            int idx = Integer.parseInt(ctx.NUMERO().getText());
            int offset = 4 * (idx + 1);

            asm.append("    mov eax, [ebp-").append(offset).append("]\n");
            asm.append("    push eax\n");
        }

        else if (text.startsWith("stloc")) {
            int idx = Integer.parseInt(ctx.NUMERO().getText());
            int offset = 4 * (idx + 1);

            asm.append("    pop eax\n");
            asm.append("    mov [ebp-").append(offset).append("], eax\n");
        }

        else if (text.startsWith("ldarg")) {
            int idx = Integer.parseInt(ctx.NUMERO().getText());
            int offset = 8 + (idx * 4);

            asm.append("    mov eax, [ebp+").append(offset).append("]\n");
            asm.append("    push eax\n");
        }

        else if (text.startsWith("dup")) {
            asm.append("    pop eax\n");
            asm.append("    push eax\n");
            asm.append("    push eax\n");
        }

        else if (text.startsWith("pop")) {
            asm.append("    pop eax\n");
        }

        return null;
    }

    // ==========================
    // Operações
    // ==========================
    @Override
    public Void visitOperadorBinario(ilParser.OperadorBinarioContext ctx) {

        String op = ctx.getText().replace(";", "");

        asm.append("    pop ebx\n");
        asm.append("    pop eax\n");

        switch (op) {
            case "add":
                asm.append("    add eax, ebx\n");
                break;
            case "sub":
                asm.append("    sub eax, ebx\n");
                break;
            case "mul":
                asm.append("    imul eax, ebx\n");
                break;
            case "div":
                asm.append("    xor edx, edx\n");
                asm.append("    div ebx\n");
                break;
        }

        asm.append("    push eax\n");

        return null;
    }

    // ==========================
    // Labels
    // ==========================
    @Override
    public Void visitLabel(ilParser.LabelContext ctx) {
        asm.append(ctx.ID().getText()).append(":\n");
        return null;
    }

    // ==========================
    // Branch
    // ==========================
    @Override
    public Void visitBranch(ilParser.BranchContext ctx) {

        String target = ctx.ID().getText();
        String instr = ctx.getChild(0).getText();

        if (instr.equals("br")) {
            asm.append("    jmp ").append(target).append("\n");
        } else {
            asm.append("    pop eax\n");
            asm.append("    cmp eax, 0\n");

            if (instr.equals("brtrue"))
                asm.append("    jne ").append(target).append("\n");
            else
                asm.append("    je ").append(target).append("\n");
        }

        return null;
    }

    // ==========================
    // Retorno
    // ==========================
    @Override
    public Void visitRetorno(ilParser.RetornoContext ctx) {

        asm.append("    mov eax, 1\n");
        asm.append("    mov ebx, 0\n");
        asm.append("    int 0x80\n");

        return null;
    }
}
