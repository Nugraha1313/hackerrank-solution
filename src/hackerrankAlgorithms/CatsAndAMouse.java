package hackerrankAlgorithms;
/*
 * @created 26/05/2022 on 17:28
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CatsAndAMouse {
    /**
     *
     * @param x -> position Cat A
     * @param y -> position Cat B
     * @param z -> position Mouse C
     * @return -> String
     */
    public static String catAndMouse(int x, int y, int z) {
        int differenceA = Math.abs(x - z);
        int differenceB = Math.abs(y - z);
        if(differenceA < differenceB)
            return "Cat A";
        else if(differenceA > differenceB)
            return "Cat B";
        return "Mouse C";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q, x, y, z;

        do {
            q = scan.nextInt();
        } while( !(q >= 1 && q <= 100) );
        ArrayList<String> outputList = new ArrayList<String>();
        for (int i = 0; i < q; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
            if( (x >= 1 && x <= 100) && (y >= 1 && y <= 100) && (z >= 1 && z <= 100) )
                outputList.add(catAndMouse(x,y,z));
            else
                i--;
        }
        scan.close();
        for (String s: outputList)
            System.out.println(s);
    }
}
