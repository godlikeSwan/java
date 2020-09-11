package func;

public class Circles {
    public static void main (String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java func.Circles.class num1 [num2, num3, ...]");
            return;
        }
        int sum = 0;
        int i;
        for (i = 0; i < args.length; i += 1) sum += Integer.parseInt(args[i]);
        System.out.println(sum);

        sum = 0;
        i = args.length;
        while (--i >= 0) sum += Integer.parseInt(args[i]);
        System.out.println(sum);

        sum = 0;
        i = args.length - 1;
        do sum += Integer.parseInt(args[i]); while (--i >= 0);
        System.out.println(sum);
    }
}