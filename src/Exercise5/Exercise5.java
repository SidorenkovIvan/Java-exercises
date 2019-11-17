package Exercise5;
import java.util.Scanner;

public class Exercise5 {

    public static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return integer == reverse;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input final number of cycle");
        int n = in.nextInt();
        if (n <= 100 && n >= 0) {
            for (int i = 0; i <= n; i++)
                if (isPalindrome(i) == true)
                    System.out.print(i + " ");
        }
        else {
            System.out.println("Wrong number");
        }
    }
}
