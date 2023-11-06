package Lambda.Example1;

public class Calculator {
    public static void main(String[] args) {
        MathLogic m = ( i, j)-> i+j;
        // We can remove braces,return, type of variable.

        System.out.println(m.add(5,3));
        System.out.println(m.add(6,4));
        }
    }
