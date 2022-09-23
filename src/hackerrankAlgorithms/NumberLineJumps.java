package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 16:08
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v2 < v1) {
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if(willIntersectOnLand)
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}
