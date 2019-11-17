package Exercise1;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number");
        int n = 0;
        int count = 0;
        if (in.hasNextInt()){
            n = in.nextInt();
            if (n % 2 == 0)
                System.out.println("Number " + n + " is even");
            else
                System.out.println("Number " + n + " is odd");
            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                    count++;
            }
            if (count > 2)
                System.out.println("Number " + n + " is compound");
            else
                System.out.println("Number " + n + " is simple");
        }
        else
            System.out.print("Your number is not int or it's not a number");
    }
}
