/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

public class Data <Generik> {
    private Generik[] ruang;
    private int banyak;

    public Data() {
        ruang = (Generik[]) new Object[100]; 
        banyak = 0;
    }

    public void setIsi(int posisi, Generik nilai) {
        if (posisi >= 1 && posisi <= 100) {

            if (ruang[posisi - 1] == null) {
                banyak++;
            }

            ruang[posisi - 1] = nilai;
        }
    }

    public Generik getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return ruang[posisi - 1];
        } else {
            return null;
        }
    }

    public int getSize() {
        return banyak;
    }
}