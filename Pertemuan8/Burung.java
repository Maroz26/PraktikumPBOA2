/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " cuit");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " terbang");
    }
}