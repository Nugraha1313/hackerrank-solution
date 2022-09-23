package hackerrank30Days;
/*
 * @created 27/05/2022 on 23:01
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class Operators {

    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        double totalCost = mealCost + ( (mealCost / 100) * tipPercent) + ( (mealCost / 100) * taxPercent) ;
        System.out.println(Math.round(totalCost));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();
        solve(mealCost, tipPercent, taxPercent);
    }
}
