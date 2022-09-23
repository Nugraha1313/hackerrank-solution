package hackerrank30Days;
/*
 * @created 22/06/2022 on 3:05
 * @project Hackerrank
 * @author Nugraha1313
 */


import java.util.Scanner;

public class Inheritence {
    static class Person {
        private String firstName, lastName;
        private int idNumber;
        private int[] scores;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }

        public int[] getScores() {
            return scores;
        }

        public void setScores(int[] scores) {
            this.scores = scores;
        }
    }

    static class Student extends Person {
        public Student(String firstName, String lastName, int idNumber, int[] scores) {
            setFirstName(firstName);
            setLastName(lastName);
            setIdNumber(idNumber);
            setScores(scores);
        }

        public char calculate() {
            int sum = 0;
            int[] arr = getScores();
            for (int j : arr) sum += j;
            int avg = sum / arr.length;

            if(avg >= 90 && avg <= 100)
                return 'O';
            else if(avg >= 80 && avg < 90)
                return 'E';
            else if(avg >= 70 && avg < 80)
                return 'A';
            else if(avg >= 55 && avg < 70)
                return 'P';
            else if(avg >= 40 && avg < 55)
                return 'D';
            else if(avg < 40)
                return 'T';
            else
                throw new IllegalStateException("Unexpected value");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int idNumber = scan.nextInt();
        int n = scan.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }
        scan.close();
        Student student1 = new Student(firstName, lastName, idNumber, scores);
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber + "\nGrade: " + student1.calculate());
    }
}
