public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(56, 78);
        Titik T3 = new Titik(1, 9);
        double jarak_pusat;

        int kuadran_0;
        
    


        T1.setAbsis(3); 
        T1.setOrdinat(4); 
        T1.printTitik(); 
        T1.geser(3,4); 
        T1.printTitik(); 
        T2.printTitik();


        kuadran_0 = T3.getKuadran();
        System.out.println("\nKuadran T3 adalah : " + kuadran_0);
        jarak_pusat = T2.getJarakPusat();
        System.out.println("Jarak T2 (56, 78) dari titik pusat adalah = " + jarak_pusat);
        System.out.println("Jarak T1 (6, 8) dari T3(1, 9) adalah = " + T1.getJarak(T3));
        T2.refleksiX();
        System.out.println("\nT2 (56, 78) setelah direfleksikan terhadap sumbu x adalah");
        T2.printTitik();
        System.out.println("\n");

        T1.refleksiY();
        T1.printTitik();


        T3.getRefleksiX().printTitik(); 
        T3.getRefleksiY().printTitik();

    }
}
