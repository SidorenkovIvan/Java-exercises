package Exercise2;
import java.util.Scanner;

public class Exercise2 {
    static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }

    static long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number1 and number2");
        if (in.hasNextInt()) {
            int num1 = in.nextInt();
            if (in.hasNextInt()) {
                int num2 = in.nextInt();
                System.out.println("Greatest common divisor of numbers is " + gcd(num1,num2));
                System.out.println("Least common multiple of numbers is " + lcm(num1,num2));
            }
            else{
                System.out.println("Input of second number is wrong");
            }
        }
        else{
            System.out.println("Input of first number is wrong");
        }
    }
}
