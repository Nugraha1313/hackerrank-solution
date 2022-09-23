package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 20:54
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class ViralAdvertising {

    /**
     *
     * @param n banyakHari
     * @return cumulativeLike
     */
    public static int viralAdvertising(int n) {
        int shared = 5, liked = 0, cumulativeLike = 0;
        for (int i = 0; i < n; i++) {
            if(i != 0)
                shared = liked * 3;
            liked = shared / 2;
            cumulativeLike += liked;
        }
        return cumulativeLike;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            n = scan.nextInt();
        } while( !(n >= 1 && n <= 50) );
        scan.close();
        System.out.println(viralAdvertising(n));
    }
}
