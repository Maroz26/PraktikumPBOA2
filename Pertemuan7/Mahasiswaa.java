public class Mahasiswaa extends Civitasakademika{
    private String NIM;
    private Dosen Dosenwali;

    public Mahasiswaa(String Nama, String NIM, Dosen Dosenwali){
        this.Nama = Nama;
        this.NIM = NIM;
        this.Dosenwali = Dosenwali;
    }


    @Override
    public String getNomor(){
        return NIM;
    }


    public Dosen getDosenwali(){
        return Dosenwali;
    }

    public void setWali(Dosen D0){
        this.Dosenwali = D0;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void tampilDataMahasiswa(){
        System.out.println("NIM = " + NIM);
        System.out.println("Nama = " + Nama);
        System.out.println("Dosen wali = " + Dosenwali.getNama());
    }
}
