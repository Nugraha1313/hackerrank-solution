package hackerrankPreparation;
/*
 * @created 23/05/2022 on 22:12
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class StaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte B, H;
        do {
            B = scan.nextByte();
        } while( !(B >= -100 && B <= 100) );

        do {
            H = scan.nextByte();
        } while( !(H >= -100 && H <= 100) );

        if(B <= 0 || H <= 0)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
            System.out.println(B * H);

        scan.close();
    }
}
