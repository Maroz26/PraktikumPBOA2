/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

class Anabul {
    String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void suara() {
        System.out.println(nama + " bersuara...");
    }

    public void gerak() {
        System.out.println(nama + " bergerak...");
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}

