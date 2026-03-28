import java.time.LocalDate;

public class Tendik extends Pegawai{
    private int bup = 55;
    private String bidang;

    public Tendik(String nip, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok, 
        String bidang
    ) {
        super(nip, nama, tanggal_lahir, tmt, gaji_pokok);
        this.bidang = bidang;
    }

    /* Konstruktor tanpa parameter */
    public Tendik(){
        super("", "", null, null, 0.0);
        this.bidang = "";
    }

    public double Tunjangan(){

        return 0.01 * hitung_kerja().getYears() * getGaji_pokok();

    }

    public int getBup(){
        return bup;
    }

    public String getBidang(){
        return bidang;
    }

    /*Saya tidak membuat setBup dikarenakan asumsi bahwa BUP tetap*/

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    @Override

    public void printInfo(){
        super.printInfo();
        System.out.println("Nama jabatan : Tendik");
        System.out.println("Bidang dalam " + bidang);
        System.out.println("Tunjangan yang dimiliki adalah " + Tunjangan());
        System.out.println("Kapan pensiun? --> "+ kapan_pensiun(bup));
        System.out.println("Rentang masa kerja adalah " + hitung_kerja());
    }
}



    