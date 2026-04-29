public class Dosen extends Civitasakademika{
    private String NIP;


    public Dosen(String Nama, String NIP){
        this.Nama = Nama;
        this.NIP = NIP;
    }

    @Override
    public String getNomor(){
        return NIP;
    }



    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }
}
