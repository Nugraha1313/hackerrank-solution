package codeLeague1;
/*
 * @created 05/05/2022 on 12:57
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class KaguyaSama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        int countKaguya = 0, iterasi = 0;
        int n = scan.nextInt();
        String[] arrText = new String[n];

        do {
            text = scan.next();
            if(text.length() > 0 && text.length() < 10000) {
                arrText[iterasi] = text;
                iterasi++;
            }
        } while( !(text.length() > 0 && text.length() < 10000) || iterasi < n );

        for (int i = 0; i < arrText.length; i++) {
            while (arrText[i].contains("KAGUYASAMA")) {
                // ! AKAN MENJADI penghitung KAGUYASAMA
                //replace ! jadi @
                arrText[i] = arrText[i].replace('!', '@');
                //replace KAGUYASAMA jadi !
                arrText[i] = arrText[i].replace("KAGUYASAMA", "!");
                //hitung banyak !
                for (int j = 0; j < arrText[i].length(); j++) {
                    if(arrText[i].charAt(j) == '!')
                        countKaguya++;
                }
                //replace ! jadi hampa / string kosong
                arrText[i] = arrText[i].replace("!", "");
            }
            System.out.println(countKaguya);
            countKaguya = 0;
        }
        scan.close();
    }
}
