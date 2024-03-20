package bg.smg;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static final char c1 = '(';
    static final char c2 = '[';
    static final char c3 = '{';
    static final char c4 = ')';
    static final char c5 = ']';
    static final char c6 = '}';
    static final char none = ' ';


    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        String brackets = sc.nextLine();
        for (Character c : brackets.toCharArray()) {
            if(isBracket(c)) {
                if(isOpenBracket(c))
                    stack.push(c);
                else {
                    if (!stack.isEmpty()) {
                        if (!stack.isEmpty() && getClosingBracket(stack.peek()).equals(c))
                            stack.pop();
                        else
                            break;
                    }
                }

            }
        }

        System.out.println(stack.isEmpty());
    }

    private static boolean isOpenBracket(Character br){
        if (br.equals(c1) || br.equals(c2) || br.equals(c3))
            return true;
        return false;
    }

    private static Character getClosingBracket(Character openBracket){
        switch (openBracket){
          case c1 : return c4;
          case c2 : return c5;
          case c3 : return c6;
        }
        return none;
    }

    private static boolean isBracket(Character br){
        if (br.equals(c1) || br.equals(c2) || br.equals(c3) || br.equals(c4) || br.equals(c5) || br.equals(c6))
            return true;
        else
            return false;
    }
}
