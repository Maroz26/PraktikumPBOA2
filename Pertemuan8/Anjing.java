/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " guk-guk");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " melata");
    }
}