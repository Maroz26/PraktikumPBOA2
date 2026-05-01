import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia {
    private String nip;
    public static int counterPNS = 0;


    /*Konstruktor */
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;

    }

    
    /*Konstruktor lengkap tapi tanpa alamat */
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, "-", pendapatan);
        this.nip = nip;
        counterPNS++;

    }

    /*Konstruktor tanpa parameter */
    
    public PNS(){
        super();
        this.nip = "";
        counterPNS = counterPNS + 1;
    }


    /*Selektor */

    public String getNip(){
        return nip;
    }

    /*Mutator */


    public void setNip(String nip){
        this.nip = nip;
    }


    /*Fungsi tambahan */
    public static int getCounterPNS(){
        return counterPNS;
    }

    public int hitungMasaKerja(){
        if(getTgl() == null){
            return 0;
        } else{
            Period masa_asli = Period.between(getTgl(), LocalDate.now());
            int tahun_masa = masa_asli.getYears();
            int hasil_akhir = tahun_masa + 7;
            /*digit NIM ke 14 = 7 */
            return hasil_akhir;
        }
    }

    public double hitungPajak(){
        double pajak = 0.10*getPendapatan();
        return pajak;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP = " + nip);
        System.out.printf("Pajak = %.0f\n", hitungPajak());
    }
}
