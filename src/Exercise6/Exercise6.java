package Exercise6;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
     static int[][] pack(int weights[], int costs[], int needed) {
        int n = weights.length;
        int dp[][] = new int[needed + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= needed; w++) {
                if (weights[j - 1] <= w) {
                    dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j - 1]][j - 1] + costs[j - 1]);
                } else {
                    dp[w][j] = dp[w][j - 1];
                }
            }
        }
        return dp;
    }

    // см. https://neerc.ifmo.ru/wiki/index.php?title=%D0%97%D0%B0%D0%B4%D0%B0%D1%87%D0%B0_%D0%BE_%D1%80%D1%8E%D0%BA%D0%B7%D0%B0%D0%BA%D0%B5
    static void restore(int[][] a, int w, int n, int[] weights, ArrayList<Integer> list) {
         if (a[w][n] == 0)
             return;
         if (a[w][n - 1] == a[w][n]) {
             restore(a, w, n - 1, weights, list);
         } else {
             restore(a, w - weights[n - 1], n - 1, weights, list);
             list.add(n);
         }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much things do u have? ");
        int n = in.nextInt();
        int[] mass = new int[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Weight of " + (i+1) + " thing is "); mass[i] = in.nextInt();
            System.out.print("Cost of " + (i+1) + " thing is ");   cost[i] = in.nextInt();
        }
        System.out.print("The carrying capacity of your pack is ");
        int carrying_capacity = in.nextInt();
        int[][] answer = pack(mass, cost, carrying_capacity);
        int w = answer.length - 1;
        int i = answer[w].length - 1;
        System.out.println("Max cost of things that u can take is " + answer[w][i]);
        ArrayList<Integer> items = new ArrayList<>();
        restore(answer, w, i, mass, items);
        System.out.print("Item indexes in knapsack (start from 1): ");
        for (Integer item : items)
            System.out.print(item + " ");
        System.out.print("\nItem weights/costs in knapsack: ");
        int totalWeight = 0;
        int totalCost = 0;
        for (Integer ind : items) {
            System.out.print(mass[ind - 1] + "/" + cost[ind - 1] + " ");
            totalWeight += mass[ind - 1];
            totalCost += cost[ind - 1];
        }
        System.out.println("(" + totalWeight + "/" +totalCost + " total)");
    }
}
