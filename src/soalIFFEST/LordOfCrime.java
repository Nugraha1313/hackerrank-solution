package soalIFFEST;
/*
 * @created 23/06/2022 on 3:31
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LordOfCrime {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Moriarty");
        names.add("Ciel");
        names.add("Albert");
        names.add("Moriarty");
        names.add("Moriarty");
        System.out.println(names);
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                if(names.get(i).equals(names.get(j))) {
//                    names.remove(j);
                    count++;
//                    System.out.println(names.get(i) + " Equals : " + names.get(j) + " (" + count + ")");
                }
            }
            map.put(names.get(i), count);
            count = 0;
        }
        System.out.println(map);
        //find value tertinggi
        List<Integer> counts = new ArrayList<>(map.values());

        for (int i = 0; i < map.size(); i++) {

        }
    }
//    public static void main(String[] args) {
//        List<String> names = new ArrayList<String>();
//        names.add("Moriarty");
//        names.add("Ciel");
//        names.add("Albert");
//        names.add("Moriarty");
//        names.add("Moriarty");
//        System.out.println(names);
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        int count = 0;
//        for (int i = 0; i < names.size(); i++) {
//            for (int j = 0; j < names.size(); j++) {
//                if(names.get(i).equals(names.get(j))) {
////                    names.remove(j);
//                    count++;
////                    System.out.println(names.get(i) + " Equals : " + names.get(j) + " (" + count + ")");
//                }
//            }
//            map.put(names.get(i), count);
//            count = 0;
//        }
//        System.out.println(map);
//        //find value tertinggi
//        List<Integer> counts = new ArrayList<>(map.values());
//
//        for (int i = 0; i < map.size(); i++) {
//
//        }
//    }
}
