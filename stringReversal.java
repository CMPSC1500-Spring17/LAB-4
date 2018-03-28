import java.util.Scanner;

public class stringReversal {



        private static String reverse(String word)
        {

            Scanner sysIn = new Scanner(System.in);
            word = sysIn.next();
            char number;
            String result = "";

            for (int i = word.length() - 1; i >= 0; i--)
            {

                number = word.charAt(i);
                result = result + number;
            }
                return result;
        }



    public static void main(String[] args)
    {

        String end = reverse("");


        System.out.println(end);


    }


}
