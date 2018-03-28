import java.util.Scanner;

public class farenheitToCelsius {

    private static double convert(double x)
    {

        Scanner sysIn = new Scanner(System.in);

        double celsius;
        x = sysIn.nextDouble();

        celsius = (x-32)/(1.8);

        return celsius;



    }

    public static void main(String [] args)
    {
        double result = convert(0);
        System.out.println("This is  " + result + "  degrees celsius");

    }
}
