package hackerrankPreparation;
/*
 * @created 25/04/2022 on 12:04
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q, a, b, n, i = 0;

        do {
//            System.out.print("q : ");
            q = scan.nextInt();
        } while(!(q >= 0 && q <= 500));

        ArrayList<Integer> tempVar = new ArrayList<Integer>();
        do {
            if(q == 0)
                break;
//            System.out.print("a : ");
            a = scan.nextInt();
//            System.out.print("b : ");
            b = scan.nextInt();
//            System.out.print("n : ");
            n = scan.nextInt();
            //valid
            if((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)) {
                tempVar.add(a);
                tempVar.add(b);
                tempVar.add(n);
                i++;
            }
            else {
                i = 0;
            }

        } while( !(a >= 0 && a <= 50) || !(b >= 0 && b <= 50) || !(n >= 1 && n <= 15) || i < q);

        //proses
        int k = 0;
        int hasil = 0;
        for (int j = 0; j < tempVar.size() / 3; j++) {
            a = tempVar.get(k++);
            b = tempVar.get(k++);
            n = tempVar.get(k++);
            // inila hitung dan print / hasil biso ditampung di array list baru gek print lalu clear
            for (int l = 0; l < n; l++) {
                if(l == 0)
                    hasil += a + (((int) Math.pow(2, l)) * b);
                else
                    hasil += ((int) Math.pow(2, l)) * b;
                if(l == n-1)
                    System.out.println(hasil);
                else
                    System.out.print(hasil + " ");
            }
            hasil = 0;
//            System.out.println();
        }

        scan.close();

    }
}
