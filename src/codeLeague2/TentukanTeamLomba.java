package codeLeague2;
/*
 * @created 24/06/2022 on 14:54
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class TentukanTeamLomba {

    static int factorial(int n)
    {
        // If value of n=1 or n=0 we return 1
        if (n == 0 || n == 1)
            return 1;

        // Generic case computation math
        // Otherwise we do n*(n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        //get team mtk
        // fac a
        int comA, comB, comC;
        comA = factorial(a) / ( factorial(1) * factorial(a - 1) );
        comB = factorial(b) / ( factorial(2) * factorial(b - 2) );
        comC = factorial(c) / ( factorial(2) * factorial(c - 2) );
        int teamMTK = comA * comB * comC;
        comA = factorial(a) / ( factorial(2) * factorial(a - 2) );
        comB = factorial(b) / ( factorial(3) * factorial(b - 3) );
        comC = factorial(c) / ( factorial(1) * factorial(c - 1) );
        int teamKimia = comA * comB * comC;
        System.out.println("Matematika: "+teamMTK + " team" + "\nKimia: " + teamKimia + " team");
    }
}
