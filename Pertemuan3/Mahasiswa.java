import java.util.ArrayList;

public class Mahasiswa{
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* Konstruktor tanpa parameter */

    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    /* Konstruktor dengan parameter */
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public void addMatKul (MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }


    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getdosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    } 

    /* MUTATOR */

    public void setNama(String nama){
        this.nama = nama;
    }


    public void setNim(String nim){
        this.nim = nim;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    /*Method tambahan */

    public int getJumlahSKS(){
        int jumlah_sks = 0;
        for(int i=0; i< listMatKul.size(); i++){
            jumlah_sks = jumlah_sks + listMatKul.get(i).getSks();
        }
        return jumlah_sks;
    }

    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("\nNim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs () {
        System.out.println("\nNim: " + nim) ;
        System.out.println("Nama: " + nama) ;
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0;i<listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getNama());

        }
        System.out.println("dosenWali : " + dosenWali.getNama());
        System.out.println("Kendaraan : " + kendaraan.getJenis());
        
    }







}








