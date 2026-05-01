/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*File : Main.java */
/*Pertemuan : 5 */



public class Main_BangunDatar {
    public static void main(String[] args) {

        /*KAMUS*/
        
        Persegi P0 = new Persegi(4, "Biru", "Hitam" );
        Persegi P1 = new Persegi(4, "Merah", "Hitam" );
        Lingkaran L0 = new Lingkaran(10, "Maroon", "3");
        Persegi P2 = new Persegi(12);
        Lingkaran L1 = new Lingkaran(20);



        /*ALGORITMA */

        System.out.println("Luas persegi tersebut adalah : " + P0.getLuas());
        System.out.println("Warna lingkaran L0 adalah : " + L0.getWarna());

        System.out.println("Apakah P0 dan P1 memiliki luas yang sama? : " + P0.isEqualLuas(P1));
        System.out.println("Apakah P1 dan P2 memiliki keliling yang sama? : " + P1.isEqualKeliling(P2));

        System.out.println("\nSisi dan luas P1 sebelum zoomIn = " + P1.getSisi() + " & " + P1.getLuas());
        P1.zoomIn();
        System.out.println("Sisi dan luas P1 setelah zoomIn = " + P1.getSisi() + " & " + P1.getLuas());


        System.out.println("\nJari-jari dan luas L1 sebelum zoomOut = " + L1.getJari() + " & " + L1.getLuas());
        L1.zoomOut();
        System.out.println("Jari-jari dan luas L1 setelah zoomOut = " + L1.getJari() + " & " + L1.getLuas());


        System.out.println("\nSisi dan luas P2 sebelum zoom = " + P2.getSisi() + " & " + P2.getLuas());
        P2.zoom(50);
        System.out.println("Sisi dan luas P2 setelah zoom = " + P2.getSisi() + " & " + P2.getLuas());


    }
}
