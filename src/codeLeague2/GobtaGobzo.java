package codeLeague2;
/*
 * @created 24/06/2022 on 14:45
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class GobtaGobzo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if(n % 5 == n)
            System.out.println("UP GAN");
        else
            System.out.println("DONE GAN");

    }
}
