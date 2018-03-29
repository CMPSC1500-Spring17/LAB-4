import java.util.Scanner;

class Lab4Part2 {

    private static void convert(int number)
    {


            System.out.print((number-32)*(5/9));

        convert(number);
    }

    public static void main(String args[])
    {
        Scanner sysIn = new Scanner(System.in);

        System.out.println("Enter a temp in F:");
        number = sysIn.nextLine();

       convert(number);
    }
}
