package hackerrankPreparation;
/*
 * @created 24/05/2022 on 19:15
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] tokens = S.split("[^a-zA-Z]");
        int numTokens = 0;

        for (int i=0; i<tokens.length; ++i) {
            if (tokens[i].length() > 0)
                numTokens++;
        }
        System.out.println(numTokens);

        for (int i=0; i<tokens.length;++i) {
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
        }
    }
}
