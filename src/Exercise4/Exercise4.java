package Exercise4;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Input your text");
        String text = in.nextLine();
        System.out.println("Input your word");
        String word = in.nextLine();
        String words[] = text.split("\\W+" );
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().equals(word.toLowerCase()))
                count++;
        }
        System.out.print("This word occur " + count + " times");
    }
}
