package ornahTI;
/*
 * @created 22/04/2022/04/2022 on 5:12
 * @project Hackerrank
 * @author aulia
 * https://www.hackerrank.com/contests/oprec-cp-omahti-pemrograman/challenges/membaca-terbalik
 */

import java.util.Scanner;

public class BacaTerbalik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S;
        boolean valid;
        do {
            valid = true;
//            System.out.print("Input : ");
            S = scan.nextLine();
//            System.out.println("S : " + S);
            for (int i = 0; i < S.length(); i++) {
//                System.out.print(S.charAt(i) + " : ");
                int konversiChar = S.charAt(i);
//                System.out.println(konversiChar);

                if( !(konversiChar >= 97 && konversiChar <= 122) && konversiChar != 32) {
                    valid = false;
//                    System.out.println("Tidak Valid");
                    break;
                }

            }

        } while ( !(S.length() >= 1 && S.length() <= 50) || !valid);

        for (int i = S.length()-1; i >= 0; i--)
            System.out.print(S.charAt(i));

    }
}
