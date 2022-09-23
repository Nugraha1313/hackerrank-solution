package hackerrankPreparation;
/*
 * @created 23/05/2022 on 22:21
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        do {
            n = scan.nextInt();
        } while( !(n >= -100 && n <= 100));

        String s = String.valueOf(n);

        System.out.println("Good job");


        scan.close();
    }
}
