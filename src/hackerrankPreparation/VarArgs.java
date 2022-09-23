package hackerrankPreparation;
/*
 * @created 23/05/2022 on 23:37
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {

    public static void add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a+b));
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + "+" + b + "+" + c +  "=" + (a+b+c));
    }

    public static void add(int a, int b, int c, int d, int e) {
        System.out.println(a + "+" + b + "+" + c + "+" + d  + "+" + e + "=" + (a+b+c+d+e));
    }
    public static void add(int a, int b, int c, int d, int e, int f) {
        System.out.println(a + "+" + b + "+" + c + "+" + d  + "+" + e +  "+" + f + "=" + (a+b+c+d+e+f));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[6];
        while (i < 6) {
            arr[i] = scan.nextInt();
            i++;
        }
        add(arr[0], arr[1]);
        add(arr[0], arr[1], arr[2]);
        add(arr[0], arr[1], arr[2], arr[3], arr[4]);
        add(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
        scan.close();
    }
}
