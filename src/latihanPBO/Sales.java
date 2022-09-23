package latihanPBO;
/*
 * @created 28/04/2022 on 18:47
 * @project Hackerrank
 * @author Nugraha1313
 */

public class Sales extends Pegawai{

    private int bonus;
    
    public Sales(String nama, int gajiPokok, int bonus) {
        super(nama, "Sales", gajiPokok);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getTotalGaji() {
        return getGajiPokok() + bonus;
    }

    @Override
    public String toString() {
        return "============================= \n" +
                "Nama \t \t: " + getNama() + "\n" +
                "Jabatan \t: " + getJabatan() + "\n" +
                "Gaji Pokok \t: Rp." + getGajiPokok() + "\n" +
                "Bonus \t \t: Rp." + getBonus() + "\n" +
                "Total Gaji \t: Rp." + getTotalGaji();
    }
}
