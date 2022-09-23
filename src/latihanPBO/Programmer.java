package latihanPBO;
/*
 * @created 28/04/2022 on 18:47
 * @project Hackerrank
 * @author Nugraha1313
 */

public class Programmer extends Pegawai{

    public Programmer(String nama, int gajiPokok) {
        super(nama, "Programmer", gajiPokok);
    }

    @Override
    public int getTotalGaji() {
        return getGajiPokok();
    }

}
