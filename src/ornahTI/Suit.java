package ornahTI;
/*
 * @created 22/04/2022/04/2022 on 4:43
 * @project Hackerrank
 * @author aulia
 * https://www.hackerrank.com/contests/oprec-cp-omahti-pemrograman/challenges/suit-tradisional/
 */

import java.util.Locale;
import java.util.Scanner;

public class Suit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inputDella = scan.next();
        String inputMarisha = scan.next();
        String output = null;
        scan.close();
        if(inputDella.equals("manusia") && inputMarisha.equals("semut") || inputDella.equals("semut") && inputMarisha.equals("gajah") || inputDella.equals("gajah") && inputMarisha.equals("manusia"))
            output = "Della";
        else if (inputMarisha.equals("manusia") && inputDella.equals("semut") || inputMarisha.equals("semut") && inputDella.equals("gajah") || inputMarisha.equals("gajah") && inputDella.equals("manusia"))
            output = "Marisha";
        else if (inputDella.equals(inputMarisha))
            output = "Seri";
        System.out.println(output);
    }

}
