package codeLeague2;
/*
 * @created 16/07/2022 on 23:06
 * @project Hackerrank
 * @author Nugraha1313
 */

public class Test2 {
    public static void main(String[] args) {
        String angka = "";
        for (int i = 1; i <= 1000; i++) {
            angka += i;
        }
        System.out.println(angka);
        // search karakter ke 1111-1 = 1110
        System.out.println(angka.charAt(1110));
    }
}
