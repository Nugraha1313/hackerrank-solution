package hackerrank30Days;
/*
 * @created 22/06/2022 on 4:21
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int value;
        LinkedList list1 = new LinkedList();

        for (int i = 0; i < t; i++) {
            value = scan.nextInt();
            list1.add(value);
        }
        for (int i = 0; i < t; i++) {
            if(i == t - 1)
                System.out.print(list1.get(i));
            else
                System.out.print(list1.get(i) + " ");
        }
    }
}
