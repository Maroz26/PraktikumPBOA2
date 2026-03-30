/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*File : Lingkaran.java */

public class Lingkaran extends BangunDatar {
    private double jari;
    
    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2 ;
        setJmlSisi(1);
        setBorder(border);
        setWarna(warna);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }
    
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari-jari : " + jari);
    }
}
