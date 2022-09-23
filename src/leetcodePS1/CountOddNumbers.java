package leetcodePS1;
/*
 * @created 26/05/2022 on 20:15
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CountOddNumbers {

    public static int countOdds1(int low, int high) {
        ArrayList<Integer> arrOdd = new ArrayList<Integer>();
        for (int i = low; i <= high; i++) {
            if(i % 2 != 0)
                arrOdd.add(i);
        }
        return arrOdd.size();
    }

    public static int countOdds(int low, int high) {
        int countBetweenLowAndHigh= (high - low) / 2;
        if (low % 2 !=0 || high % 2 !=0)
            countBetweenLowAndHigh +=1;
        return countBetweenLowAndHigh;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int low, high;
        do {
            low = scan.nextInt();
            high = scan.nextInt();
        } while( !(low >= 0 && low <= high) || !(high <= Math.pow(10,9)) );
        scan.close();
        System.out.println(countOdds(low,high));
    }
}
