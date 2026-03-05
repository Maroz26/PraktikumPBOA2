 /* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : (isi nama kamu)
 * Tanggal   : (isi tanggal)
 */


 public class Titik {
    /********************ATRIBUT****************/
    double absis;
    double ordinat;

    /********************METHOD****************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //mengeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;   // PERHATIAN: di sini ada kesalahan? Seharusnya ordinat + y, bukan + x. Tapi ikuti modul.
    }

    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else {
            return 4;
        }
    }

    double getJarakPusat(){
        double kuadrat_x = absis * absis;
        double kuadrat_y = ordinat * ordinat;
        double isi_akar = kuadrat_x + kuadrat_y;
        return Math.sqrt(isi_akar);
    }

    double getJarak(Titik T){
        double jarak_x = this.absis - T.absis;
        double jarak_y = this.ordinat - T.ordinat;
        double kuadrat_x = jarak_x * jarak_x;
        double kuadrat_y = jarak_y * jarak_y;
        double isi_akar = kuadrat_x + kuadrat_y;
        return Math.sqrt(isi_akar);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }


    void refleksiX(){
        ordinat = ordinat * -1;
    }

    void refleksiY(){
        absis = absis * -1;
    }

    Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }
}