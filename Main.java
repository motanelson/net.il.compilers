import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("Uso: java Main ficheiro.il");
            return;
        }

        String input = new String(Files.readAllBytes(Paths.get(args[0])));

        ilLexer lexer = new ilLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ilParser parser = new ilParser(tokens);

        ParseTree tree = parser.programa();

        ILToX86Compiler compiler = new ILToX86Compiler();
        compiler.visit(tree);

        String asm = compiler.getCode();

        Files.write(Paths.get("output.asm"), asm.getBytes());

        System.out.println("Assembly gerado: output.asm");
    }
}
