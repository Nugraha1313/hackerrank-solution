package hackerrankPreparation;
/*
 * @created 25/05/2022 on 22:49
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class JavaInterface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if(x % i == 0)
                sum += i;
        }
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sum);
    }
}
