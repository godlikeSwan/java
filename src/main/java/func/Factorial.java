package func;

public class Factorial {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Factorial <num>");
            return;
        }
        int i = Integer.parseInt(args[0]);
        int result = 1;
        do result *= i; while (--i > 0);
        System.out.println(result);
    }
}