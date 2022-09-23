package hackerrank30Days;
/*
 * @created 31/05/2022 on 16:12
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte t;
        String s;
        boolean isFinish = false;
        do {
            t = scan.nextByte();
        } while( !(t >= 1 && t <= 10) );

        for (int i = 0; i < t; i++) {
            s = scan.next();
            for (int j = 0; j < s.length(); j++) {
                if(j % 2 == 0 && !isFinish) {
                    System.out.print(s.charAt(j));
                    if(s.length() % 2 == 0) {
                        if(j == s.length() - 2) {
                            j = 0;
                            isFinish = true;
                            System.out.print(" ");
                        }
                    }
                    else {
                       if(j == s.length() - 1) {
                           j = 0;
                           isFinish = true;
                           System.out.print(" ");
                       }
                    }
                }
                else if(j % 2 != 0 && isFinish)
                    System.out.print(s.charAt(j));
            }
            isFinish = false;
            System.out.println();
        }
        scan.close();
    }
}
