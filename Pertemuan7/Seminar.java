public class Seminar {
    private int banyakpeserta;
    private Civitasakademika [] pesertas = new Civitasakademika[100];

    public Seminar(){
        banyakpeserta = 0;
    }

    public int countPeserta(){
        return banyakpeserta;
    }

    /*4.d */

    public void registrasi(Civitasakademika C0){
        if(banyakpeserta <100){
            pesertas[banyakpeserta] = C0;
            banyakpeserta = banyakpeserta + 1;
        } else {
            System.out.println("Sorry seminar ini sudah habis kuotanya");
        }
    }

    /*4.g */

    public void tampilPeserta(){
        for(int i =0 ; i<banyakpeserta; i++){
            System.out.println("Nomor peserta " + i + " = " + pesertas[i].getNomor() );
            System.out.println("Nama peserta " + i + " = " + pesertas[i].getNama());

        }
    }


    /*4.h */
    public int countMahasiswa(){
        int banyaknya;
        banyaknya = 0;
        for(int i = 0; i<banyakpeserta;i++){
            if(pesertas[i] instanceof Mahasiswaa){
                banyaknya = banyaknya + 1;
            }
        }
        return banyaknya;
    }
}
