package hackerrank1Week;
/*
 * @created 26/05/2022 on 5:13
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LonelyInteger {


    /**
     * Dengan asumsi pasti akan ada element yang unique
     * @param arr
     * @return int
     */
    public static int lonelyinteger(ArrayList<Integer> arr) {
        int base = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == base) {
                arr.remove(i);
                arr.remove(0);
                base = arr.get(0);
                i = 1;
            }
            else if(i == arr.size() - 1 && (arr.get(i) != base))
                return  base;
        }
        if(arr.size() == 1)
            return base;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, value;
        ArrayList<Integer> arr = new ArrayList<>();
        do {
            n = scan.nextInt();
        } while( !(n >= 1 && n < 100) );

        //input
        for (int i = 0; i < n; i++) {
            value = scan.nextInt();
            if(value >= 0 && value <= 100)
                arr.add(value);
            else
                i--;
        }
        scan.close();
        //find unique
        System.out.println(lonelyinteger(arr));
    }
}
