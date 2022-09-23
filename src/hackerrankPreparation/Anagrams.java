package hackerrankPreparation;
/*
 * @created 24/05/2022 on 16:33
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams {

    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        int intCharA = 0;
        int intCharB = 0;

        // hitung total  int character jika sama true
        for (int i = 0; i < a.length(); i++)
            intCharA += a.charAt(i);
        for (int i = 0; i < b.length(); i++)
            intCharB += b.charAt(i);

        return (intCharA == intCharB);
    }

    public static boolean isAnagram2(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int count = 0;
        ArrayList<Character> listA = new ArrayList<Character>();
        ArrayList<Character> listB = new ArrayList<Character>();

        // isi nilai
        for (int i = 0; i < a.length(); i++)
            listA.add(a.charAt(i));
        for (int i = 0; i < b.length(); i++)
            listB.add(b.charAt(i));

        // perbandingan pake count
        if(a.length() == b.length()) {

            for (int i = 0; i < listA.size(); i++) {
                for (int j = 0; j < listB.size(); j++) {
                    if((int) listA.get(i) == (int) listB.get(j)) {
                        listA.remove(i);
//                        System.out.println("Remove A : " + listA.remove(i));
                        listB.remove(j);
//                        System.out.println("Remove B : " + listB.remove(j));
                        i = 0;
                        j = 0;
                        count++;
//                        System.out.println("listA = "+listA);
//                        System.out.println("listB = "+listB);
                    }
                }
            }

        }

        if((int) listA.get(0) == (int) listB.get(0)) {
//            System.out.println("Remove A : " + listA.remove(0));
            listA.remove(0);
//            System.out.println("Remove B : " + listB.remove(0));
            listB.remove(0);
            count++;
        }
//        System.out.println("=============================");
//        System.out.println("listA = "+listA);
//        System.out.println("listB = "+listB);
//        System.out.println("Count = " + count);
        return (count == a.length() && count == b.length());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a;
        String b;

        do {
            a = scan.next();
            b = scan.next();
        } while( !(a.length() >= 1 && a.length() <= 50) || !(b.length() >= 1 && b.length() <= 50));

        if(isAnagram2(a,b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
