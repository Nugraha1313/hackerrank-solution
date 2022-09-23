package ornahTI;
/*
 * @created 22/04/2022/04/2022 on 11:13
 * @project Hackerrank
 * @author aulia
 *
 */

import java.util.Scanner;

public class EkspresiMarisha2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kalimat;
        int total = 0, representasiKarakter = 0, konversiKarakter;
        do {
            kalimat = scan.nextLine();
        } while ( (kalimat.length() <= 0 || kalimat.length() > 100));
        kalimat = kalimat.toLowerCase();
        //hitung total representasi karakter
        for (int i = 0; i < kalimat.length(); i++) {
            switch(kalimat.charAt(i)) {
                case 'a':
                    representasiKarakter = 1;
                    break;
                case 'b':
                    representasiKarakter = 2;
                    break;
                case 'c':
                    representasiKarakter = 3;
                    break;
                case 'd':
                    representasiKarakter = 4;
                    break;
                case 'e':
                    representasiKarakter = 5;
                    break;
                case 'f':
                    representasiKarakter = 6;
                    break;
                case 'g':
                    representasiKarakter = 7;
                    break;
                case 'h':
                    representasiKarakter = 8;
                    break;
                case 'i':
                    representasiKarakter = 9;
                    break;
                case 'j':
                    representasiKarakter = 10;
                    break;
                case 'k':
                    representasiKarakter = 11;
                    break;
                case 'l':
                    representasiKarakter = 12;
                    break;
                case 'm':
                    representasiKarakter = 13;
                    break;
                case 'n':
                    representasiKarakter = 14;
                    break;
                case 'o':
                    representasiKarakter = 15;
                    break;
                case 'p':
                    representasiKarakter = 16;
                    break;
                case 'q':
                    representasiKarakter = 17;
                    break;
                case 'r':
                    representasiKarakter = 18;
                    break;
                case 's':
                    representasiKarakter = 19;
                    break;
                case 't':
                    representasiKarakter = 20;
                    break;
                case 'u':
                    representasiKarakter = 21;
                    break;
                case 'v':
                    representasiKarakter = 22;
                    break;
                case 'w':
                    representasiKarakter = 23;
                    break;
                case 'x':
                    representasiKarakter = 24;
                    break;
                case 'y':
                    representasiKarakter = 25;
                    break;
                case 'z':
                    representasiKarakter = 26;
                    break;
                case '.':
                    representasiKarakter = 27;
                    break;
                case ',':
                    representasiKarakter = 28;
                    break;
                case ' ':
                    representasiKarakter = 29;
                    break;
                case '!':
                    representasiKarakter = 30;
                    break;
                case '?':
                    representasiKarakter = 31;
                    break;
                default:
                    representasiKarakter = 0;
                    break;
            }
            total += representasiKarakter;
        }
        System.out.println("Total : " + total);
        if(total % 4 == 0)
            System.out.println("Menangis");
        else if (total % 4 == 1)
            System.out.println("Cemberut");
        else if (total % 4 == 2)
            System.out.println("Biasa saja");
        else if (total % 4 == 3)
            System.out.println("Tersenyum");

    }
}
