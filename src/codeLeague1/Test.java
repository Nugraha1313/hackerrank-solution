package codeLeague1;
/*
 * @created 05/05/2022 on 13:17
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String x = "!xKAGUYASAMAPPKAGUYASAMA!";
        System.out.println("sebelum : " + x);

        int count = 0;
        x = x.replace('!', '@');
        while(x.contains("KAGUYASAMA")) {
            x = x.replace("KAGUYASAMA", "!");

        }
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == '!')
                count++;
        }
        System.out.println("sesudah : "+x);
        System.out.println("Count : "+count);
    }
}
