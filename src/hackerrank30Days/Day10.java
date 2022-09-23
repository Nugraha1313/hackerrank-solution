package hackerrank30Days;
/*
 * @created 20/06/2022 on 4:36
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Day10 {
    /**
     * binary numbers
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int counter = 0;
        String binary = Integer.toBinaryString(n);
        ArrayList<Integer> arr = new ArrayList<Integer>();
//        System.out.println(n + " \n" + binary);
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '0') {
//                System.out.println(counter + " ditambahkan pada perulangan ke-" + i);
                arr.add(counter);
                counter = 0;
                continue;
            }
            counter++;
            if(i == binary.length() - 1 && binary.charAt(i) == '1')
                arr.add(counter);
//            System.out.println("loop -" + i + ": " + counter);
        }
//        System.out.println(arr);
        if(arr.size() != 0) {
            int max = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if(arr.get(i) > max)
                    max = arr.get(i);
            }
            System.out.println(max);
        }
        else
            System.out.println(counter);
    }
}
