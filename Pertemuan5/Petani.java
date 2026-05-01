import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia {
    private String asal_kota;
    private static int counterPetani = 0;

    /*Konstruktor */
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani = counterPetani + 1;

    }

    /*Konstruktor lengkap tapi tanpa alamat */
    public Petani(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, "-", pendapatan);
        this.asal_kota = asal_kota;
        counterPetani = counterPetani + 1;

    }

    /*Konstruktor tanpa parameter */
    
    public Petani(){
        super();
        this.asal_kota = "";
        counterPetani++;
    }


    /*Selektor */

    public String getAsalkota(){
        return asal_kota;
    }

    /*Mutator */


    public void setAsalkota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    /*Fungsi lain */

    public static int getCounterPetani(){
        return counterPetani;
    }

    public int hitungMasaKerja(){
        if(getTgl() == null){
            return 0;
        } else{
            Period masa_asli = Period.between(getTgl(), LocalDate.now());
            int tahun_masa = masa_asli.getYears();
            int hasil_akhir = tahun_masa + 1;
            /*NIM ke 12 saya = 1 */
            return hasil_akhir;
        }
    }

    
    public double hitungPajak(){
        double pajak = 0.0;
        return pajak;
    }

    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal kota = " + asal_kota);
        System.out.println("Pajak = "+ hitungPajak());
    }

    
}
