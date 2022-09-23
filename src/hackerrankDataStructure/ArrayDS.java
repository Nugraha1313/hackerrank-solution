package hackerrankDataStructure;
/*
 * @created 31/05/2022 on 2:15
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.*;

public class ArrayDS {

    public static List<Integer> reverseArray(List<Integer> a) {
        Collections.reverse(a);
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, value;

        do {
            n = scan.nextInt();
        } while( !(n >= 1 && n <= Math.pow(10, 3)) );

        List<Integer> A = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            value = scan.nextInt();
            if(value >= 1 && value <= Math.pow(10, 4))
                A.add(value);
            else
                i--;
        }
        scan.close();
        List<Integer> reverseArr = reverseArray(A);
        for (int i = 0; i < n; i++)
            System.out.print(reverseArr.get(i) + " ");
    }

    public static void tampung() {
        // reverse
        // 1 ditampung di arr lain
        Integer[] arr = {1,4,3,2};
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = (arr.length - 1); i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
        // 2 tampung di  list
        // a. list = arr as list
        // b. collection.reverse(list)
        // print tostring.list.toArr
        List<Integer> reverseArr = Arrays.asList(arr);
        Collections.reverse(reverseArr);
        System.out.println(Arrays.toString(reverseArr.toArray()));
    }

}
