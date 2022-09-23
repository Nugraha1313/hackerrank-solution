package hackerrankPreparation;
/*
 * @created 25/05/2022 on 22:33
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        scan.close();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
