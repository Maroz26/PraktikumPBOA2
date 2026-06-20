/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

public class Main {
    public static void main(String[] args) {

        Anabul a1 = new Kucing("Milo", 14);
        Anabul a2 = new Anjing("Doggy");
        Anabul a3 = new Burung("Tweety");

        Data<Anabul> data = new Data<>();

        Datum<Integer> a = new Datum<>();
        Datum<Integer> b = new Datum<>();
        Datum<String> c = new Datum<>();
        Datum<String> d = new Datum<>();

        Anggora ag_0 = new Anggora("Mimi", 4.5);
        Kembangtelon kt_0 = new Kembangtelon("Luna", 3.0);
        double totalBobot;

        
        a.setIsi(3);
        b.setIsi(6);

        System.out.println(a.getIsi());
        System.out.println(b.getIsi());


        Anabul[] daftar = {a1, a2, a3};

        Datum<Anabul> e = new Datum<>();
        Datum<Anabul> f = new Datum<>();

        Datum<Anabul> datumAnabul = new Datum<>();


        for (Anabul j : daftar) {
            j.suara();
            j.gerak();
            System.out.println();
        }


        data.setIsi(1, new Kucing("Milo", 9));
        data.setIsi(2, new Anjing("Doggy"));
        Anabul b1 = data.getIsi(1);
        Anabul b2 = data.getIsi(2);

        System.out.println(b1.getNama());
        System.out.println(b2.getNama());

        if (b1 != null) {
            b1.suara();
        }
        if (b2 != null) {
            b2.suara();
        }

        System.out.println("Jumlah data = " + data.getSize());


        System.out.println("Sebelum");
        System.out.println(a.getIsi());
        System.out.println(b.getIsi());

        OperatorGenerik.Tukar(a, b);

        System.out.println("Sesudah");
        System.out.println(a.getIsi());
        System.out.println(b.getIsi());

        c.setIsi("Halo");
        d.setIsi("Dunia");

        OperatorGenerik.Tukar(c, d);

        System.out.println(c.getIsi());
        System.out.println(d.getIsi());

        e.setIsi(new Anjing("Doggy"));
        f.setIsi(new Kucing("Kitty", 4.5));

        OperatorGenerik.Tukar(e, f);


        System.out.println(e.getIsi().getNama());
        System.out.println(f.getIsi().getNama());


        totalBobot = OperatorGenerik.Bobot2(ag_0, kt_0);

        System.out.println(totalBobot);

        datumAnabul.setIsi(new Kucing("Oyen", 5));
        datumAnabul.getIsi().suara();

    }
}
