package hackerrankPreparation;
/*
 * @created 24/05/2022 on 16:22
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Locale;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A;
        String temp = "";

        do {
            A = scan.next();
        } while( !(A.length() > 0 && A.length() <= 50) );

        scan.close();

        A = A.toLowerCase();

        for (int i = A.length() - 1; i >= 0; i--)
            temp += A.charAt(i);
        // jika x = temp, maka yes
        if(A.compareTo(temp) == 0) {System.out.println("Yes");}
        else {System.out.println("No");}

    }
}
