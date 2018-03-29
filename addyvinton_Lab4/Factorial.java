import java.util.Scanner;

public class Factorial {

        private static int factorial(int x)
        {

            if( x == 1)

                return x;
            else

                return x * factorial(x-1);

        }

    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int y = sysIn.nextInt();

        int result = factorial(y);

        System.out.print(result);
    }
}
