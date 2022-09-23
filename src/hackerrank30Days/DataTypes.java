package hackerrank30Days;
/*
 * @created 26/05/2022 on 14:57
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);

        int inputInt = scan.nextInt();
        double inputDouble = scan.nextDouble();
        scan.nextLine();
        String inputString = scan.nextLine();
        scan.close();

        System.out.print((i + inputInt) + "\n" +
                (d + inputDouble) + "\n" +
                s.concat(inputString));

    }
}
