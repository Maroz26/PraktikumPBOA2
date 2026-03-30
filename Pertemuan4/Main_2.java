/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*File : Main.java */


public class Main_2 {
    public static void main(String[] args) {
        
        System.out.println("APLIKASI PERSEGI\n");
        Persegi P0 = new Persegi(4, "Biru", "Hitam" );
        Persegi P1 = new Persegi(8, "Merah", "Hitam" );
        System.out.println("Luas persegi P0 dengan panjang sisi 4 adalah : " + P0.getLuas());
        System.out.println("Keliling persegi P1 dengan panjang sisi 8 tersebut adalah : " + P1.getKeliling());
        P1.setSisi(3);
        System.out.println("Keliling persegi P1 setelah di setSisi menjadi 3 adalah : " + P1.getKeliling());
        System.out.println("Diagonal persegi P1 adalah : " + P1.getDiagonal());
        System.out.println("warna border persegi P1 adalah : " + P1.getBorder());
        System.out.println("warna fill persegi P1 adalah : " + P1.getWarna());
        System.out.println("\nHasil printInfo() dari P1 : ");
        P1.printInfo();

        System.out.println("\n\nAPLIKASI LINGKARAN\n");

        Lingkaran L0 = new Lingkaran(7, "Pink", "Hitam" );
        Lingkaran L1 = new Lingkaran(1, "Jingga", "Ungu" );
        System.out.println("Luas Lingkaran L0 dengan panjang diameter 7 adalah : " + L0.getLuas());
        System.out.println("Keliling Lingkaran L0 dengan panjang diameter 7 adalah : " + L0.getKeliling());
        System.out.println("Jari Lingkaran L1 skrng adalah : " + L1.getJari());
        L1.setJari(9);
        System.out.println("Jari Lingkaran L1 setelah di set 9 skrng adalah : " + L1.getJari());
        System.out.println("Keliling persegi L1 skrng adalah : " + L1.getKeliling());
        System.out.println("\nHasil printInfo() dari L1 : ");
        L1.printInfo();


        System.out.println("\n");
        BangunDatar.printCounterBangunDatar();





    }
}