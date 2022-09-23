package hackerrank30Days;
/*
 * @created 22/06/2022 on 4:37
 * @project Hackerrank
 * @author Nugraha1313
 */


import java.util.Scanner;

public class MoreExceptions {

    static class Calculator {
        public int power(int n, int p){
            if(n < 0 || p < 0)
                throw new IllegalArgumentException("n and p should be non-negative");
            else
                return (int) Math.pow(n,p);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t, n, p;
        t = scan.nextInt();
        while (t-- > 0) {
            Calculator cal1 = new Calculator();
            n = scan.nextInt();
            p = scan.nextInt();
            try {
                int result = cal1.power(n, p);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }
}
