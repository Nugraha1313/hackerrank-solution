package hackerrankPreparation;
/*
 * @created 23/05/2022 on 19:57
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class EndOfLife {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        int i = 0;
        while(scan.hasNext()) {
            i++;
            System.out.println(i + " " + scan.nextLine());
        }
        scan.close();
    }
}
