package hackerrankPreparation;
/*
 * @created 25/04/2022 on 11:39
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, result = 0;
        do {
            n = scan.nextInt();
            if( (n >= 2 && n <= 20)) {
                for (int i = 1; i <= 10; i++) {
                    result = n * i;
                    System.out.println(n + " x " + i + " = " + result);
                }
            }

        }while ( !(n >= 2 && n <= 20) );

        scan.close();
    }
}
