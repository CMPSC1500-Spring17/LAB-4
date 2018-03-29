import java.util.Scanner;

public class countCannonball {


    private static int countCannon(int x)
    {

        if (x == 0)
        {
            return 0;
        }

        else {

                return (x * x - countCannon(x- 1));

        }

    }


    public static void main(String[] args)
    {
        Scanner sysIn = new Scanner(System.in);
        int height = sysIn.nextInt();
        int number=0;

        for(int i = height; i>= 0; i --)
        {

            number= number + countCannon(i);
        }

        System.out.println(number);
    }

}
