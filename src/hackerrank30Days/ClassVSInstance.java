package hackerrank30Days;
/*
 * @created 31/05/2022 on 1:27
 * @project Hackerrank
 * @author Nugraha1313
 */


import java.util.Scanner;

class Person {
    private int age;
    public Person(int initialAge) {
        if(initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
            this.age = initialAge;

    }
    public int yearPasses() {
        return this.age++;
    }
    public void amIOld() {
        if(age < 13)
            System.out.println("You are young.");
        else if(age < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }
}

public class ClassVSInstance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte T, age;

        do {
            T = scan.nextByte();
        } while( !(T >= 1 && T <= 4) );

//        int[] arrAge = new int[T];

        for (int i = 0; i < T; i++) {
            age = scan.nextByte();
            // jika valid age
            if(age >= -5 && age <= 30) {
//                arrAge[i] = age;
                Person person = new Person(age);
                person.amIOld();
                person.yearPasses();
                person.yearPasses();
                person.yearPasses();
                person.amIOld();
                System.out.println();
            }
            else
                i--;
        }

//        for (int j : arrAge) {
//            Person person = new Person(j);
//            person.amIOld();
//            person.yearPasses();
//            person.yearPasses();
//            person.yearPasses();
//            person.amIOld();
//        }

        scan.close();
    }
}
