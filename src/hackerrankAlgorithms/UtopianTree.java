package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 19:25
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        final int MONSOON = 100, SUMMER = 200;
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        for (int i = 0; i < caseCount; i++) {
            int treeHeight = 1;
            int cycleType = MONSOON;
            int cycleCount = input.nextInt();
            for (int j = 0; j < cycleCount; j++) {
                switch (cycleType) {
                    case MONSOON -> {
                        treeHeight = treeHeight * 2;
                        cycleType = SUMMER;
                    }
                    case SUMMER -> {
                        treeHeight += 1;
                        cycleType = MONSOON;
                    }
                }
            }
            System.out.println(treeHeight);
        }
    }
}
