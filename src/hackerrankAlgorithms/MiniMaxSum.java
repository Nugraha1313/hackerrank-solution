package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 1:36
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class MiniMaxSum {

    public static void miniMaxSum(long[] arr) {
        long miniSum = 0, maxSum = 0, tempSum = 0;
        //min
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j)
                    continue;
                tempSum += arr[j];
                if(i == 0) {
                    miniSum = tempSum;
                    maxSum = tempSum;
                }
            }
            if(tempSum < miniSum)
                miniSum = tempSum;
            else if(tempSum > maxSum)
                maxSum = tempSum;
            tempSum = 0;
        }
        System.out.println(miniSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long value;
        long[] arr = new long[5];
        for (int i = 0; i < arr.length; i++) {
            value = scan.nextLong();
            if(value >= 1 && value <= Math.pow(10,9))
                arr[i] = value;
            else
                i--;
        }
        scan.close();
        miniMaxSum(arr);
    }
}
