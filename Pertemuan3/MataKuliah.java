public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;


    /*Konstruktor tanpa parameter */

    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 1;
    }

    public MataKuliah(String idMatKul, String nama, int sks ){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdmatkul(){
        return idMatKul;
}

    public String getNama(){
        return nama;
}

    public int getSks(){
        return sks;
    }

    public void setIdMatkul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }



}
