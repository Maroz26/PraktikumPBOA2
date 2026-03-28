import java.time.Period;
import java.time.LocalDate;


public abstract class Pegawai {
    /* Atribut */
    private String nip;
    private String nama;
    private LocalDate tanggal_lahir;
    private LocalDate tmt;
    private double gaji_pokok;

    /* Konstruktor dengan parameter */

    public Pegawai (String nip, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.tmt = tmt;
        this.gaji_pokok = gaji_pokok;
    }

    /* Konstruktor tanpa parameter */

    public Pegawai(){
        this.nip = "";
        this.nama = "";
        this.tanggal_lahir = null;
        this.tmt = null;
        this.gaji_pokok = 0.0;
    }

    public Period hitung_kerja(){
        Period waktu;
        if(tmt != null){
            waktu = Period.between(tmt, LocalDate.now());
        }
        else{
            tmt = LocalDate.now(); /*ini agar tidak crash ketika pengguna memakai konstruktor tanpa parameter */
            waktu = Period.between(tmt, LocalDate.now());
        }
        
        return waktu;
    }

    public LocalDate kapan_pensiun(int bup){

        int tahun = tanggal_lahir.getYear();
        int tahun_final = tahun + bup;
        int bulan = tanggal_lahir.getMonthValue();
        int bulan_final = bulan + 1;
        int tanggal = tanggal_lahir.getDayOfMonth();
        
    
        if(bulan_final > 12){
            bulan_final = 1;
            tahun_final = tahun_final + 1;
    
        } 

        if(tanggal != 1){
            tanggal = 1;
        }

        LocalDate tanggal_pensiun = LocalDate.of(tahun_final, bulan_final, tanggal);
        return tanggal_pensiun; 

    }

    public void printInfo(){
        System.out.println("nip --> " + nip);
        System.out.println("nama --> " + nama);
        if(tanggal_lahir != null){
            System.out.println("tanggal lahir --> " + tanggal_lahir);
        } else {
            System.out.println("Tanggal lahir belum terisi!");
        }
        if(tanggal_lahir != null){
            System.out.println("tmt --> " + tmt);
        } else {
            System.out.println("Tmt belum terisi!");
        }
        
        System.out.println("gaji pokok --> " + gaji_pokok);
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getTanggal_lahir(){
        return tanggal_lahir;
    }

    public LocalDate getTmt(){
        return tmt;
    }

    public double getGaji_pokok(){
        return gaji_pokok;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggal_lahir(LocalDate tanggal_lahir){
        this.tanggal_lahir = tanggal_lahir;
    }

    public void setTmt(LocalDate tmt){
        this.tmt = tmt;

    }

    public void setGaji_pokok(double gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }
}


