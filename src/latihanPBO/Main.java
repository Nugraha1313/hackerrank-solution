package latihanPBO;
/*
 * @created 28/04/2022 on 18:48
 * @project Hackerrank
 * @author Nugraha1313
 */

public class Main {
    public static void main(String[] args) {
        Programmer pegawai1 = new Programmer("George Harry", 1000000);
        Programmer pegawai2 = new Programmer("Adin Chandra", 1500000);
        Programmer pegawai3 = new Programmer("Albertina", 2000000);
        Sales pegawai4 = new Sales("Baikhaqi", 1200000, 800000);
        Manajer pegawai5 = new Manajer("Bernard", 3000000, 2000000);
        System.out.println(pegawai1 + "\n" + pegawai2 + "\n" + pegawai3 + "\n" + pegawai4 + "\n" + pegawai5);
    }
}
