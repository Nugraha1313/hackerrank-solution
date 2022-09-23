package latihanPBO;
/*
 * @created 28/04/2022 on 18:48
 * @project Hackerrank
 * @author Nugraha1313
 */

public class Manajer extends Pegawai{

    private int tunjangan;

    public Manajer(String nama, int gajiPokok, int tunjangan) {
        super(nama, "Manajer", gajiPokok);
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public int getTotalGaji() {
        return getGajiPokok() + tunjangan;
    }

    @Override
    public String toString() {
        return "============================= \n" +
                "Nama \t \t: " + getNama() + "\n" +
                "Jabatan \t: " + getJabatan() + "\n" +
                "Gaji Pokok \t: Rp." + getGajiPokok() + "\n" +
                "Tunjangan \t: Rp." + getTunjangan() + "\n" +
                "Total Gaji \t: Rp." + getTotalGaji();
    }

}
