package codeLeague2;
/*
 * @created 16/07/2022 on 22:44
 * @project Hackerrank
 * @author Nugraha1313
 */

public class Test {
    public static void main(String[] args) {
        int day = 50, jumlahPenduduk = 0, counterDay = 0;
        for (int i = 0; i < day; i++) {
            counterDay = i + 1;
            if(i == 0)
                jumlahPenduduk = 1;
            else if(counterDay % 3 == 0)
                jumlahPenduduk /= 2;
            else
                jumlahPenduduk *= 3;
        }
        System.out.println(jumlahPenduduk);
    }
}
