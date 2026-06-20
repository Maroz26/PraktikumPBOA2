/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

public class OperatorGenerik {

    public static <Generik> void Tukar(Datum<Generik> a, Datum<Generik> b){
        Generik temp = a.getIsi();

        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <Generik extends Kucing> double Bobot2(Generik kucing1, Generik kucing2){
        return kucing1.getBobot() + kucing2.getBobot();
    }

}