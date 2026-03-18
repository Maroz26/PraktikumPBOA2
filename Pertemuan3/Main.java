public class Main { 
    public static void main(String[] args){
        /*Aplikasi Dosen.java */
        System.out.println("APLIKASI Dosen.java");

        Dosen D0 = new Dosen("111", "Kyujin", "Informatika");
        System.out.println("\nNIP dia adalah " + D0.getNip());
        System.out.println("Nama dia adalah " + D0.getNama());
        System.out.println("Prodi dia adalah " + D0.getProdi());
        D0.setNama("Yoona");
        System.out.println("Nama setelah di set = " + D0.getNama());
        System.out.println("\n\n");

        /*Aplikasi Matakuliah.java */
        System.out.println("APLIKASI MataKuliah.java");

        MataKuliah Matkul0 = new MataKuliah("000", "Quantum Mechanics", 3);
        System.out.println("\nidMatkul-nya adalah " + Matkul0.getIdmatkul());
        System.out.println("Nama matkul adalah " + Matkul0.getNama());
        System.out.println("jumlah sks-nya adalah " + Matkul0.getSks());
        Matkul0.setNama("Physical Aesthetics");
        System.out.println("Nama setelah di set = " + Matkul0.getNama());
        System.out.println("\n\n");

        /*Aplikasi Kendaraan.java */
        System.out.println("APLIKASI Kendaraan.java");
        Kendaraan K0 = new Kendaraan("B023", "Aston Martin");
        String NP0 = K0.getNoPlat();
        String jns = K0.getJenis();
        System.out.println("\nNomor plat K0 adalah " + NP0);
        System.out.println("\nJenis K0 adalah " + jns);

       /*Aplikasi Mahasiswa.java */
        System.out.println("APLIKASI Mahasiswa.java");
        Mahasiswa M0 = new Mahasiswa( "2406012", "Hazel", "Informatics");
        System.out.println("NIM anak ini adalah : " + M0.getNim());
        System.out.println("Nama anak ini adalah : " + M0.getNama());
        System.out.println("Prodi anak ini adalah : "+  M0.getProdi());

        MataKuliah Matkul1 = new MataKuliah("001", "Agama", 3);
        M0.addMatKul(Matkul1);
        System.out.println("Salah satu matkul anak ini adalah : " + M0.listMatKul.get(0).getNama());

        Dosen dosen0 = new Dosen("001", "Seol Yoona", "Informatika");
        M0.setDosenWali(dosen0);
        System.out.println("Dosen wali anak ini adalah : "+ M0.getdosenWali().getNama());

        Kendaraan K1 = new Kendaraan("AB01", "Motor Ninja");
        M0.setKendaraan(K1);
        System.out.println("jenis Kendaraan milik si anak ini adalah : " + M0.getKendaraan().getJenis());


        /*Diatas adalah pemakaian method satuan get.nama dll, sedangkan dibawha ini adalah contoh implementasi untuk method tambahan */

        MataKuliah Matkul2 = new MataKuliah("002", "Pemrograman", 3);
        MataKuliah Matkul3 = new MataKuliah("003", "Matematika", 2);
        M0.addMatKul(Matkul2);
        M0.addMatKul(Matkul3);

        System.out.println("\nJumlah MatKul yang diambil anak ini adalah " + M0.getJumlahMatKul());
        System.out.println("\nJumlah sks yang diambil anak ini adalah " + M0.getJumlahSKS());

        System.out.println("\n\nHasil printMhs()");
        M0.printMhs();
        System.out.println("\n\nHasil printDetailMhs()");
        M0.printDetailMhs();
        
    }
}