package hackerrankAlgorithms;
/*
 * @created 25/05/2022 on 23:30
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tripletsAlice = new int[3];
        int[] tripletsBob = new int[3];
        int point = 0, alicePoints = 0, bobPoints = 0;
        //alice
        for (int i = 0; i < 3; i++) {
            point = scan.nextInt();
            // jika valid
            if(point >= 1 && point <= 100)
                tripletsAlice[i] = point;
            else
                i--;
        }
        //bob
        for (int i = 0; i < 3; i++) {
            point = scan.nextInt();
            // jika valid
            if(point >= 1 && point <= 100)
                tripletsBob[i] = point;
            else
                i--;
        }
        scan.close();
        //compare
        for (int i = 0; i < 3; i++) {
            if(tripletsAlice[i] > tripletsBob[i])
                alicePoints += 1;
            else if(tripletsAlice[i] < tripletsBob[i])
                bobPoints += 1;
        }
        System.out.println(alicePoints + " " + bobPoints);
    }
}
