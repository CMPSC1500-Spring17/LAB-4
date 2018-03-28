import java.util.Scanner;

public class triangleSideLengths {


    private static double lengtha()
    {
        Scanner sysIn = new Scanner(System.in);

        double [] arr = new double [6];

        for(int i = 0; i < 6; ++i) {

            arr[i] = sysIn.nextDouble();
        }

        double lengthA = Math.sqrt(Math.pow((arr[2] - arr[0]), 2) + Math.pow((arr[3] - arr[1]), 2));

        return lengthA;

    }

    public static void main(String[] args)
    {


        double resulta = lengtha();



        System.out.println("Side A has a length of:" + resulta);


    }
}
