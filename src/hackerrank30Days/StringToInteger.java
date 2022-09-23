package hackerrank30Days;
/*
 * @created 22/06/2022 on 4:27
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String s = scan.next();
            int x = Integer.parseInt(s);
            System.out.println(x);
            scan.close();
        } catch (Exception E) {
            System.out.println("Bad String");
        }
    }
}
