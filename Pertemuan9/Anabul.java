/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */


class Anabul{
    String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    // method suara (akan dioverride)
    public void suara() {
        System.out.println(nama + " bersuara...");
    }

    // method gerak (akan dioverride)
    public void gerak() {
        System.out.println(nama + " bergerak...");
    }
}

