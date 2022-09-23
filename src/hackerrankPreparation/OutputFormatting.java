package hackerrankPreparation;
/*
 * @created 25/04/2022 on 8:24
 * @project Hackerrank
 * @author Nugraha1313
 *
 */

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        String tempString = "", tempInt = "";
        for(int i = 0; i < 3; i++) {
//            System.out.print("s1 : ");
            String s1=sc.next();
//            System.out.print("x : ");
            int x=sc.nextInt();
            // invalid
            if(s1.length() > 10 || !(x >= 0 && x <= 999) ) {
                i--;
            }
            else{
                //tempstring
                tempString = s1;
                for (int j = tempString.length(); j < 15; j++) {
                    tempString = tempString.concat(" ");
                }
                //tempint
                if(x < 10)
                    tempInt = "00";
                else if(x < 100)
                    tempInt = "0";
                tempInt = tempInt.concat(String.valueOf(x));
                //arr[i] = tempString + tempInt
                arr[i] = tempString.concat(tempInt);
                tempInt = "";
                tempString = "";
            }

        }
        //output
        System.out.println("================================");
        for (String z: arr) {
            System.out.println(z);
        }
        System.out.println("================================");
    }
}
