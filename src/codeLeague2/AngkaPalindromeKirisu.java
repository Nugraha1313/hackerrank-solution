package codeLeague2;
/*
 * @created 24/06/2022 on 16:01
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AngkaPalindromeKirisu {

    public static boolean isPalindrome(int n) {
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        return (temp == sum);
    }

    public static void main(String[] args) {
        int num = 8;
        int x = 2;
        int y = 3;

        Set<String> set = new HashSet<>();
        ArrayList<Integer> tampungRandom = new ArrayList<>();
        String temp = "";
        int i = 0;
        int count = 0;
        int totalX = 0;
        int totalY = 0;
        int totalXY = 0;
        int totalYX = 0;
        int totalRan = 0;

        while (true) {
            System.out.println("===============1=============");
            temp += String.valueOf(x);
            totalX += x;
            if(totalX == num) {
                if(isPalindrome(Integer.parseInt(temp))) {
                    count++;
                    System.out.println(temp);
                    set.add(temp);
                    break;
                }
            }
            if(totalX > x)
                break;
            i++;
        }

        //2
        temp = "";
        i = 0;
        while (true) {
            System.out.println("===============2=============");
            temp += String.valueOf(y);
            totalY += y;
            if(totalY == num) {
                if(isPalindrome(Integer.parseInt(temp))) {
                    count++;
                    set.add(temp);
                    System.out.println(temp);
                    break;
                }
            }
            if(totalY > num)
                break;
            i++;
        }
        //3
        temp = "";
        i = 0;
        while (true) {
            System.out.println("===============3=============");
            temp += String.valueOf(x);
            totalXY += x;
            if(totalXY == num) {
                if(isPalindrome(Integer.parseInt(temp))) {
                    count++;
                    set.add(temp);
                    System.out.println(temp);
                    break;
                }
            }
            temp += String.valueOf(y);
            totalXY += y;
            if(totalXY == num) {
                if(isPalindrome(Integer.parseInt(temp))) {
                    count++;
                    System.out.println(temp);
                    set.add(temp);
                    break;
                }
            }
            if(totalXY > num)
                break;
            i++;
        }
        //4
        temp = "";
        i = 0;
        while (true) {
            System.out.println("===============4=============");
            temp += String.valueOf(y);
            totalYX += y;
            if(totalYX == num) {
                if(isPalindrome(Integer.parseInt(temp))) {
                    count++;
                    System.out.println(temp);
                    set.add(temp);
                    break;
                }
            }
            temp += String.valueOf(x);
            totalXY += x;
            if(totalYX == num) {
                if(isPalindrome(Integer.parseInt(temp))) {
                    count++;
                    System.out.println(temp);
                    set.add(temp);
                    break;
                }
            }
            if(totalYX > num)
                break;
            i++;
        }

        //5
        temp = "";
        i = 0;
        while (true) {
//            System.out.println("===============5=============");
            // ran x = 0 y = 1
            // 0 to 1
            int ran = (int) (Math.random() * 2);
//            System.out.println(ran);

            // x
            //                System.out.println("masuk total");
            //                    System.out.println("masuk PAL");
            if(ran == 0) {
//                System.out.println("masuk x");
                temp += String.valueOf(x);
                totalRan += x;
            }
            else {
//                System.out.println("masuk y");
                temp += String.valueOf(y);
                totalRan += y;
            }
            if(totalRan == num) {
//                System.out.println("masuk total");
                if(isPalindrome(Integer.parseInt(temp))) {
//                    System.out.println("masuk PAL");
                    set.add(temp);
                    count++;
                    System.out.println(temp);
                }
            }
            if(i == 10000)
                break;
            if(totalRan > num || set.contains(temp)) {
                totalRan = 0;
                temp = "";
                i = 0;
            }
//            System.out.println(temp);
            i++;
        }

        //6
        temp = "";
        totalXY = 0;
        i = 0;
        while (true) {
            if(i % 2 == 0) {
                temp += String.valueOf(x);
                totalXY += x;
            }
            else {
                temp += String.valueOf(y);
                totalXY += y;
            }
            if(totalYX == num) {
                if(isPalindrome(Integer.parseInt(temp))) {
                    count++;
                    System.out.println(temp);
                    set.add(temp);
                    break;
                }
            }
            if(totalXY > num)
                break;
            i++;
        }

        //7
        temp = "";
        totalYX = 0;
        i = 0;
        while (true) {
            if(i % 2 == 0) {
                temp += String.valueOf(y);
                totalYX += y;
            }
            else {
                temp += String.valueOf(x);
                totalYX += x;
            }
            if(totalYX == num) {
                if(isPalindrome(Integer.parseInt(temp))) {
                    count++;
                    System.out.println(temp);
                    set.add(temp);
                    break;
                }
            }
            if(totalYX > num)
                break;
            i++;
        }

        System.out.println(count);
        System.out.println(set.size() + " SET SIZE");
        System.out.println(set);
    }
}
