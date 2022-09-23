package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 18:54
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Locale;
import java.util.Scanner;

public class DesignerPDFViewer {
    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(int[] h, String word) {
        int[] heightLetter = new int[word.length()];
        int tallestLetter = heightLetter[0];
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a' -> heightLetter[i] = h[0];
                case 'b' -> heightLetter[i] = h[1];
                case 'c' -> heightLetter[i] = h[2];
                case 'd' -> heightLetter[i] = h[3];
                case 'e' -> heightLetter[i] = h[4];
                case 'f' -> heightLetter[i] = h[5];
                case 'g' -> heightLetter[i] = h[6];
                case 'h' -> heightLetter[i] = h[7];
                case 'i' -> heightLetter[i] = h[8];
                case 'j' -> heightLetter[i] = h[9];
                case 'k' -> heightLetter[i] = h[10];
                case 'l' -> heightLetter[i] = h[11];
                case 'm' -> heightLetter[i] = h[12];
                case 'n' -> heightLetter[i] = h[13];
                case 'o' -> heightLetter[i] = h[14];
                case 'p' -> heightLetter[i] = h[15];
                case 'q' -> heightLetter[i] = h[16];
                case 'r' -> heightLetter[i] = h[17];
                case 's' -> heightLetter[i] = h[18];
                case 't' -> heightLetter[i] = h[19];
                case 'u' -> heightLetter[i] = h[20];
                case 'v' -> heightLetter[i] = h[21];
                case 'w' -> heightLetter[i] = h[22];
                case 'x' -> heightLetter[i] = h[23];
                case 'y' -> heightLetter[i] = h[24];
                case 'z' -> heightLetter[i] = h[25];
                default -> throw new IllegalStateException("Unexpected value");
            }
        }

        for (int i = 0; i < heightLetter.length; i++) {
            if(heightLetter[i] > tallestLetter)
                tallestLetter = heightLetter[i];
        }
        return (tallestLetter * word.length());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int value;
        int[] h = new int[26];
        for (int i = 0; i < h.length; i++) {
            value = scan.nextInt();
            if(value >= 1 && value <= 7)
                h[i] = value;
            else
                i--;
        }

        do {
            word = scan.next();
        } while( !(word.length() >= 1 && word.length() <= 10) );
        word = word.toLowerCase();
        scan.close();
        System.out.println(designerPdfViewer(h, word));
    }
}
