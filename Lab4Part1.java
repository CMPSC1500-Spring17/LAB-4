import java.util.Scanner;

class Lab4
{
    private static String ReverseString(String original)
    {
        int length = original.length();
        String reverse= "";
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);

        return reverse;
    }

    public static void main(String args[])
    {

        Scanner sysIn = new Scanner(System.in);

        String original, reverse = "";

        System.out.println("Enter a string to reverse:");
        original = sysIn.nextLine();


       reverse=ReverseString(original);

        System.out.println(reverse);
    }
}