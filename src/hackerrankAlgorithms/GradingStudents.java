package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 3:00
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GradingStudents {

    public static ArrayList<Integer> gradingStudents(ArrayList<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i) > 95) {
                if(100 - grades.get(i) < 3)
                    grades.set(i, 100);
            }
            else if(grades.get(i) > 90) {
                if(95 - grades.get(i) < 3)
                    grades.set(i,95);
            }
            else if(grades.get(i) > 85) {
                if(90 - grades.get(i) < 3)
                    grades.set(i,90);
            }
            else if(grades.get(i) > 80) {
                if(85 - grades.get(i) < 3)
                    grades.set(i,85);
            }
            else if(grades.get(i) > 75) {
                if(80 - grades.get(i) < 3)
                    grades.set(i,80);
            }
            else if(grades.get(i) > 70) {
                if(75 - grades.get(i) < 3)
                    grades.set(i,75);
            }
            else if(grades.get(i) > 65) {
                if(70 - grades.get(i) < 3)
                    grades.set(i,70);
            }
            else if(grades.get(i) > 60) {
                if(65 - grades.get(i) < 3)
                    grades.set(i,65);
            }
            else if(grades.get(i) > 55) {
                if(60 - grades.get(i) < 3)
                    grades.set(i,60);
            }
            else if(grades.get(i) > 50) {
                if(55 - grades.get(i) < 3)
                    grades.set(i,55);
            }
            else if(grades.get(i) > 45) {
                if(50 - grades.get(i) < 3)
                    grades.set(i,50);
            }
            else if(grades.get(i) > 40) {
                if(45 - grades.get(i) < 3)
                    grades.set(i,45);
            }
            else if(grades.get(i) >= 38)
                grades.set(i,40);
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value, n;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        do {
            n = scan.nextInt();
        } while( !(n >= 1 && n <= 60) );

        for (int i = 0; i < n; i++) {
            value = scan.nextInt();
            if(value >= 0 && value <= 100)
                grades.add(value);
            else
                i--;
        }
        grades = gradingStudents(grades);
        for (int x: grades)
            System.out.println(x);
    }
}
