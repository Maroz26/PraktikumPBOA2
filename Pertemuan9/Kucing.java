/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

class Kucing extends Anabul {
    int bobot;


    public Kucing(String nama, int bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    public void suara() {
        System.out.println(nama + " meong");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " melata");
    }

    public double getBobot(){
        return bobot;
    }
}
