/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

class Kucing extends Anabul {
    double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot(){
        return bobot;
    }

    public void setBobot(double bobot){
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
}
