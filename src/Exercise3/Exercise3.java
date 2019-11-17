package Exercise3;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your text");
        String string = in.nextLine();
        int count = 0;
        if (string.length() != 0) {
            count++;
            if (string.charAt(0) == ' ')
                count--;
            for (int i = 1; i < string.length(); i++)
                if(string.charAt(i - 1) == ' ' && Character.isLetter(string.charAt(i)))
                    count++;
        }
        else{
            System.out.println("Text is empty");
        }
        System.out.println("This text has " + count + " words");
        if (Character.isLetter(string.charAt(0)))
            System.out.print(Character.toUpperCase(string.charAt(0)));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i - 1) == ' ' && Character.isLetter(string.charAt(i)))
                System.out.print(Character.toUpperCase(string.charAt(i)));
            else
                System.out.print(string.charAt(i));
        }
    }
}
