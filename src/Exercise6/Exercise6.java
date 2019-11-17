package Exercise6;
import java.util.Scanner;

public class Exercise6 {
     static int pack(int weights[], int costs[], int needed) {
        int n = weights.length;
        int dp[][] = new int[needed + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= needed; w++) {
                if (weights[j-1] <= w) {
                    dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j-1]][j - 1] + costs[j-1]);
                } else {
                    dp[w][j] = dp[w][j - 1];
                }
            }
        }
        return dp[needed][n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much things do u have? ");
        int n = in.nextInt();
        int[] mas1 = new int[n];
        int[] mas2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Weight of " + (i+1) + " thing is "); mas1[i] = in.nextInt();
            System.out.print("Cost of " + (i+1) + " thing is "); mas2[i] = in.nextInt();
        }
        System.out.print("The carrying capacity of your pack is ");
        int carrying_capacity = in.nextInt();
        System.out.println("Max value of things that u can take is " + pack(mas1,mas2,carrying_capacity));
    }
}
