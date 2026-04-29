import java.text.NumberFormat.Style;

public class Main {
    public static void main(String[] args) {

        int A, D_1;
        String B, D_0;
        double C;

        Dosen Dos0 = new Dosen("Han Sohee", "784");
        Dosen Dos1 = new Dosen("Jun Jihyun", "784");
        
        /*5 objek mahasiswa untuk no 4 */

        Mahasiswaa M3 = new Mahasiswaa("Shin Sekyung", "421" , Dos0);
        Mahasiswaa M4 = new Mahasiswaa("Seol Yoona", "422",  Dos1);
        Mahasiswaa M5 = new Mahasiswaa("Kim Taehee", "423" , Dos0);
        Mahasiswaa M6 = new Mahasiswaa("Kim Sohee", "424",  Dos0);
        Mahasiswaa M8 = new Mahasiswaa("Lee Jieun", "425",  Dos1);



        A = 65;
        B = String.valueOf(A); // konversi int ke String
        C = A; // otomatis (widening)

        System.out.println("Nilai A dalam integer adalah " + A);
        System.out.println("Nilai A dalam string adalah " + B);
        System.out.println("Nilai A dalam real adalah " + C);

        /* Dari String ke int */
        D_0 = "65";
        D_1 = Integer.parseInt(D_0);
        System.out.println("String 65 setelah dikonversi ke int menggunakan parseInt menghasilkan " + D_1);

        /* Dari String ke double */
        String E_0 = "65";
        double E_1 = Double.parseDouble(E_0);
        System.out.println("String 65 setelah dikonversi ke double menggunakan parseDouble menghasilkan " + E_1);

        /* Dari int atau double ke String */
        int F_0 = 65;
        String F_1 = String.valueOf(F_0);
        System.out.println("int 65 setelah dikonversi menjadi string menghasilkan " + F_1);

        double G_0 = 65.0;
        String G_1 = String.valueOf(G_0);
        System.out.println("double 65 setelah dikonversi menjadi string menghasilkan " + G_1);

        /* int ke double ke int lagi */
        int H_0 = 192;
        double H_1 = (double) H_0;
        int H_2 = (int) H_1;

        System.out.println("192 sebagai int = " + H_0);
        System.out.println("192 sebagai real = " + H_1);
        System.out.println("192 sebagai int kembali = " + H_2);

        /*
        c. String X dan Y → concat & penjumlahan
        */
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("Hasil concat X dan Y = " + S);
        System.out.println("Hasil Z adalah " + Z);

        /*
        d. String P dan Q → double
        */
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("Hasil concat P dan Q = " + R);
        System.out.println("Hasil penjumlahan P dan Q adalah " + D);

        /*
        e. Konversi S ke Integer
        */
        int A2 = Integer.parseInt(S);
        System.out.println("Nilai A2 dari S adalah " + A2);


        /*
        f. Konversi A ke String T
        */
        String T = String.valueOf(A);
        System.out.println("Nilai T dari A adalah " + T);


         /*II.a */
        /*Ada di kelas Mahasiswa */

         /*II.b dan II.d*/
         Mahasiswa M0 = new Mahasiswa(453, "Moon Chaewon", "Theater");
         System.out.println("\nPada awalnya, prodi Mahasiswa M0 bernama Moon Chaewon adalah " + M0.getProgramStudi());
         M0.setProgramStudi("Medicine");
        System.out.println("Setelah diset dari Theater menjadi Medicine maka prodi dia adalah " + M0.getProgramStudi());
        System.out.println("\n");


        /*II.c */

         Mahasiswa M1 = new Mahasiswa();
         System.out.println("NIM default adalah " + M1.getNIM());

         System.out.println("Nama.default adalah " + M1.getNama());

         System.out.println("ProgramStudi default adalah " + M1.getProgramStudi() );

      

         /*II.e */
         M1.setNIM(290391);
         M1.setNama("Bae Juhyun");
         M1.setProgramStudi("Informatics");

         Mahasiswa M2 = new Mahasiswa(M1);
         System.out.println("\nPerbandingan identitas Mahasiswa M1 dan kloningnya yaitu M2 sebagai berikut\n");
         System.out.println("NIM M1 = " + M1.getNIM());
         System.out.println("Nama M1 = " + M1.getNama());
         System.out.println("ProgramStudi M1 = " + M1.getProgramStudi());
         System.out.println("\n");
         System.out.println("NIM M2 = " + M2.getNIM());
         System.out.println("Nama M2 = " + M2.getNama());
         System.out.println("ProgramStudi M2 = " + M2.getProgramStudi());

         /*POLIMORFISME UNIVERSAL INCLUSION*/
         System.out.println("\n\nPOLIMORFISME UNIVERSAL INCLUSION\n");
         Anabul A0 = new Anabul();

         System.out.println("Cara Anabul bergerak -> ");
         A0.Gerak();

        System.out.println("Cara Anabul bersuara -> ");
         A0.Bersuara();
        
        System.out.println("\n");
        Kucing K0 = new Kucing();

        System.out.println("Cara Kucing bergerak -> ");
        K0.Gerak();

        System.out.println("Cara Kucing bersuara -> ");
        K0.Bersuara();
        System.out.println("\n");

        Anjing J0 = new Anjing();

        System.out.println("Cara Anjing bergerak -> ");
        J0.Gerak();

        System.out.println("Cara Anjing bersuara -> ");
        J0.Bersuara();
        System.out.println("\n");


        Burung B0 = new Burung();

        System.out.println("Cara Burung bergerak -> ");
        B0.Gerak();

        System.out.println("Cara Burung bersuara -> ");
        B0.Bersuara();
        System.out.println("\n");


        /*4 */


        /*c */

        Seminar S0 = new Seminar();
        System.out.println("Jumlah peserta seminar adalah " + S0.countPeserta());


        S0.registrasi(Dos0);
        S0.registrasi(Dos1);
        S0.registrasi(M3);
        S0.registrasi(M4);
        S0.registrasi(M5);

        System.out.println("Jumlah peserta seminar sekarang adalah " + S0.countPeserta());


        System.out.println("\nData para peserta seminar S0 sebagai berikut");
        S0.tampilPeserta();

        System.out.println("\nBanyaknya mahasiswa di seminar ini adalah " + S0.countMahasiswa());

        System.out.println("\nNama dosen wali Mahasiswa M5 pada awalnya adalah " + M5.getDosenwali().getNama());
        M5.setWali(Dos1);
        System.out.println("Nama dosen wali Mahasiswa M5 setelah dirubah adalah " + M5.getDosenwali().getNama());

        System.out.println("\nSecara keseluruhan, data mahasiswa M5 adalah ");
        M5.tampilDataMahasiswa();




    }
}