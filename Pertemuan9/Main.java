/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

/*
 * NIM    : 12345678
 * Nama   : Mahasiswa Contoh
 * Tanggal: 20 Juni 2026
 * Praktikum PBO – Koleksi
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== UJI KELAS Teman ===");
        Teman T = new Teman();

        T.addNama("Juhyun");
        T.addNama("Kyujin");
        T.addNama("Yoona");
        T.addNama("Juhyun");  

        T.showTeman();
        System.out.println("Jumlah elemen: " + T.getNbelm());

        T.delNama("Kyujin");
        System.out.println("Setelah hapus Kyujin:");
        T.showTeman();
        System.out.println("Jumlah elemen: " + T.getNbelm());

        T.gantiNama("Yoona", "Yuna");
        System.out.println("Setelah ganti Yoona -> Yuna:");
        T.showTeman();

        System.out.println("Apakah 'Juhyun' ada? " + T.isMember("Juhyun"));
        System.out.println("Jumlah 'Juhyun': " + T.countNama("Juhyun"));
        System.out.println("Nama indeks 1: " + T.getNama(1));


        Piaraan P = new Piaraan();

        Kucing k1 = new Kucing("Roseanne", 5);
        Kucing k2 = new Kucing("Jieun", 7);
        Kucing k3 = new Kucing("Yoojung", 6);
        Anjing a1 = new Anjing("Buddy");
        Kucing k4 = new Kucing("Sohee", 2);

        P.enqueueAnabul(k1);
        P.enqueueAnabul(k2);
        P.enqueueAnabul(a1);
        P.enqueueAnabul(k3);
        P.enqueueAnabul(k4);

        P.showAnabul();
        System.out.println("Jumlah elemen: " + P.getNbelm());

        P.showJenisAnabul();

        System.out.println("Jumlah kucing dalam antrian: " + P.countKucing());
        System.out.println("Total bobot kucing: " + P.bobotKucing());

        Anabul first = P.getAnabul();
        if (first != null) {
            System.out.println("Anabul pertama: " + first.getNama());
        }

        P.dequeueAnabul();
        System.out.println("Setelah dequeue:");
        P.showAnabul();
        System.out.println("Jumlah elemen: " + P.getNbelm());

        System.out.println("Apakah 'Roseanne' ada? " + P.isMember(k1));
        System.out.println("Apakah 'Jieun' ada? " + P.isMember(k2));
    }
}
