/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*File : Pengusaha.java */
/*Pertemuan : 5 */


import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;

    /*Konstruktor */
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha = counterPengusaha + 1;

    }

    /*Konstruktor lengkap tapi tanpa alamat */
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, "-", pendapatan);
        this.npwp = npwp;
        counterPengusaha = counterPengusaha + 1;

    }

    /*Konstruktor tanpa parameter */
    
    public Pengusaha(){
        super();
        this.npwp = "";
        counterPengusaha++;
    }


    /*Selektor */

    public String getNpwp(){
        return npwp;
    }

    /*Mutator */


    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    /*Fungsi lain */

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    
    public int hitungMasaKerja(){
        if(getTgl() == null){
            return 0;
        } else{
            Period masa_asli = Period.between(getTgl(), LocalDate.now());
            int tahun_masa = masa_asli.getYears();
            int hasil_akhir = tahun_masa + 4;
            /*NIM ke 13 saya = 4 */
            return hasil_akhir;
        }
    }


    public double hitungPajak(){
        double pajak = 0.15*getPendapatan();
        return pajak;
    }

    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP = " + npwp);
        System.out.printf("Pajak = %.0f\n", hitungPajak());
    }



    
}
