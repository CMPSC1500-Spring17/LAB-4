import java.util.Scanner;

public class Recursion {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int number=reader.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial( int n){
        int x;
        if (n == 0 || n == 1){
            x = 1;
        }
        else {
            x = n * factorial(n -1);

        }


        return x;
    }
