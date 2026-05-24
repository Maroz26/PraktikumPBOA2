public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " -- Angka itu bukan merupakan angka yang orang orang percaya sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            System.out.println("INI ADALAH HASIL cobaAngka(10)");
            as.cobaAngka(10);
            System.out.println("\n\n");
            System.out.println("INI ADALAH HASIL cobaAngka(13)");
            as.cobaAngka(13);
            System.out.println("\n\n");
            System.out.println("INI ADALAH HASIL cobaAngka(12)");
            as.cobaAngka(12);
            System.out.println("\n\n");
        } catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("masukkan angka sesukamu!!");
        }
    }
}
