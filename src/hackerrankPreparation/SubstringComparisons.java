package hackerrankPreparation;
/*
 * @created 24/05/2022 on 2:10
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String sequence = s.substring(0, k);
        String smallest = sequence;
        String largest = sequence;

        // Complete the function
        for(int i = 1; i <= (s.length() - k); i++){
            sequence = s.substring(i, (i + k));
            if(sequence.compareTo(smallest) < 0)
                smallest = sequence;
            if(sequence.compareTo(largest) > 0)
                largest = sequence;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        do {
            s = scan.next();
        } while( !(s.length() >= 1 && s.length() <= 1000) );

        int k = scan.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
