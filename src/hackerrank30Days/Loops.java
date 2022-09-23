package hackerrank30Days;
/*
 * @created 31/05/2022 on 1:58
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte n;
        int result;

        do {
            n = scan.nextByte();
        } while( !(n >= 2 && n <= 20) );

        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
        scan.close();
    }
}
