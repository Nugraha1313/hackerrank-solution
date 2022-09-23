package hackerrankPreparation;
/*
 * @created 24/05/2022 on 2:02
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s;
        int start, end;

        do {
            s = scan.nextLine();
        } while( !(s.length() >= 1 && s.length() <= 100) );

        do {
            start = scan.nextInt();
            end = scan.nextInt();
        } while( !(start >= 0 && start < end) || !(end <= s.length()) );

        System.out.println(s.substring(start,end));

        scan.close();
    }
}
