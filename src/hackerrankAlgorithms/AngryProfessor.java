package hackerrankAlgorithms;
/*
 * @created 31/05/2022 on 20:30
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
        int countArrived = 0;
        // hitung banyak yang tepat waktu
        for (Integer integer : a) {
            if (integer <= 0)
                countArrived++;
        }
        if(countArrived < k)
            return ("YES");
        else
            return ("NO");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte t;
        int n, k, value;
        do {
            t = scan.nextByte();
        } while( !(t >= 1 && t <= 10) );

        for (int i = 0; i < t; i++) {
            do {
                n = scan.nextInt();
            } while( !(n >= 1 && n <= 1000) );

            do {
                k = scan.nextInt();
            } while( !(k >= 1 && k <= n) );
            List<Integer> a = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                value = scan.nextInt();
                if(value >= -100 && value <= 100)
                    a.add(value);
                else
                    j--;
            }
            System.out.println(angryProfessor(k, a));
            a.clear();
        }

        scan.close();
    }
}
