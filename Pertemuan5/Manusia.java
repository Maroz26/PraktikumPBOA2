import java.time.LocalDate;

public abstract class Manusia {
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;


    /*Konstruktor */

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns =counterMns + 1;
    }

    public Manusia(){
        this.nama = "";
        this.tgl_mulai_kerja = null;
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns =counterMns + 1;
    }


    /*Selektor */

    public String getNama(){
        return nama;
    }

    public LocalDate getTgl(){
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    /*Mutator */


    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTgl(LocalDate tanggal){
        this.tgl_mulai_kerja = tanggal;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }
    
    /*Fungsi dan prosedur lain */

    public void cetakInfo(){
        System.out.println("Nama = " + nama);
        System.out.println("Tanggal mulai kerja = " + tgl_mulai_kerja);
        System.out.println("Alamat = " + alamat);
        System.out.printf("Pendapatan = %.0f\n", pendapatan);
    }

    public abstract int hitungMasaKerja();

    public abstract double hitungPajak();
}


