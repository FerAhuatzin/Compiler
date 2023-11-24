package Lexer;
import java.io.*;
public class Compilador
{

    public static void main(String[] args) throws IOException {

        Reader lector = new BufferedReader(new FileReader("Proyecto/src/Lexer/input.txt"));
        Lexer lexer = new Lexer(lector);
        Tokens token;

        do {
            token = lexer.yylex();
            if (token != null) {
                // Procesar el token
                System.out.println(token);
            }
        } while (token != null);
    }

}//end Lexer.Compilador
