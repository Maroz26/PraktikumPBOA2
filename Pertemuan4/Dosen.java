import java.time.LocalDate;

public abstract class Dosen extends Pegawai{
    protected String fakultas;
    
    public Dosen(String nip, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok, String fakultas){
        super(nip, nama, tanggal_lahir, tmt, gaji_pokok);
        this.fakultas = fakultas;
    }

    public Dosen(){
        super();
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    
}
