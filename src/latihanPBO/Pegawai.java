package latihanPBO;
/*
 * @created 28/04/2022 on 18:47
 * @project Hackerrank
 * @author Nugraha1313
 */

public abstract class Pegawai {
    private String nama, jabatan;
    private int gajiPokok;

    public Pegawai(String nama, String jabatan, int gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @Override
    public String toString() {
        return "============================= \n" +
                "Nama \t \t: " + getNama() + "\n" +
                "Jabatan \t: " + getJabatan() + "\n" +
                "Gaji Pokok \t: Rp." + getGajiPokok() + "\n" +
                "Total Gaji \t: Rp." + getTotalGaji();
    }

    public abstract int getTotalGaji();

}
