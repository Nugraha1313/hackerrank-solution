package hackerrank30Days;
/*
 * @created 12/06/2022 on 2:35
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {
    public static void solution2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String,Integer> myMap= new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String name = in.next();
            if (myMap.containsKey(name)) {
                int phone = myMap.get(name);
                System.out.println(name + "=" + phone);
            } else System.out.println("Not found");
        }
        in.close();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        String name, phoneNumber, query;
        do {
            n = scan.nextInt();
            scan.nextLine();
        } while( !(n >= 1 && n <= Math.pow(10,5)) );

        Map<String, String> phoneNumbers = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            scan.nextLine();
//            System.out.print("name : ");
            name = scan.nextLine();
            name = name.toLowerCase();
            do {
//                System.out.print("phoneNumber : ");
                phoneNumber = scan.next();
            } while( phoneNumber.length() != 8 );
//            System.out.println(name + " " + phoneNumber);
            phoneNumbers.put(name, phoneNumber);
//            System.out.println(phoneNumbers);
        }
//        for (String i : phoneNumbers.keySet()) {
//            System.out.println("key: " + i + " value: " + phoneNumbers.get(i));
//        }
        for (int i = 0; i < n; i++) {
            query = scan.next();
            query = query.toLowerCase();
            if(phoneNumbers.get(query) != null) {
                System.out.println(query + "=" + phoneNumbers.get(query));
            } else
                System.out.println("Not found");
        }
        scan.close();
    }
}
