import java.time.LocalDate;

public class Dosen_tetap extends Dosen{
    private String nidn;
    private int BUP = 65;

    public Dosen_tetap(String nip, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok, String fakultas, String nidn){
        super(nip, nama, tanggal_lahir, tmt, gaji_pokok, fakultas);
        this.nidn = nidn;
    }
    
    public double tunjangan(){
        double tahun = hitung_kerja().getYears();
        return tahun * 0.02 * getGaji_pokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("NIDN ini adalah : " + nidn);
        System.out.println("Jabatannya adalah : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kerja : " + hitung_kerja() + " tahun");
        System.out.println("Tanggal Pensiun : " + kapan_pensiun(BUP));
        System.out.println("Gaji Pokok : " + getGaji_pokok());
        System.out.println("Tunjangan : " + tunjangan());
    }
}




