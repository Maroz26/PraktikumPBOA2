public class Mahasiswa{
    private int NIM;
    private String Nama;
    private String ProgramStudi;

    // Constructor
    Mahasiswa(int NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    Mahasiswa(){
    this.NIM = -999;
    this.Nama = "n/a";
    this.ProgramStudi = "n/a"; 
    }

    
    Mahasiswa(Mahasiswa M){
        this.NIM = M.getNIM();
        this.Nama = M.getNama();
        this.ProgramStudi = M.getProgramStudi();
    }

    public int getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProgramStudi() {
        return ProgramStudi;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }


    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }


    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.getProgramStudi(); 
    }




}