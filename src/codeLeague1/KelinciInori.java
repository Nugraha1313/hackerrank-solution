package codeLeague1;
/*
 * @created 05/05/2022 on 18:22
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class KelinciInori {

    public static String solution(int v1, int v2, int distance) {
        if(v1 > v2) return null;
        else {
            int totalSeconds = (distance * 3600) / (v2 - v1);
            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = (totalSeconds % 3600) % 60;
            return String.format("%dH %dM %dS" , hours, minutes, seconds);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        int distance = scan.nextInt();
        System.out.println(solution(v1, v2, distance));
        scan.close();
    }
}
