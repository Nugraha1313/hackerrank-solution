package hackerrank30Days;
/*
 * @created 22/06/2022 on 4:05
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
                sum += i;
        }
        return sum;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        Calculator cal1 = new Calculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(cal1.divisorSum(n));
    }
}
