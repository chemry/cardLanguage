
package card;

import card.parser.*;
import card.lexer.*;
import card.node.*;

import java.io.*;
import java.util.Scanner;

public class Compiler {
    public static void main(String[] args) {
//  Scanner in = new Scanner(System.in);
//  String file = in.next();
//  System.out.println(file);
        try {
            //Createa Parser instance.
            Parser p = new Parser(
                    new Lexer(
                            new PushbackReader(
                                    new BufferedReader(
                                            new FileReader(args[0])), 1024)));
            //Parsetheinput.
            Start tree = p.parse();
            tree.apply(new SemanticAnalyzer());
            System.out.println("Good");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

