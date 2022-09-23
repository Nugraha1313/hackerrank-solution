package hackerrankPreparation;
/*
 * @created 24/05/2022 on 0:03
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String B = scan.next();

        //1
        System.out.println(A.length() + B.length());
        //2
        if(A.charAt(0) > B.charAt(0))
            System.out.println("Yes");
        else
            System.out.println("No");

        String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String newB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(newA + " " + newB);

        scan.close();
    }
}
