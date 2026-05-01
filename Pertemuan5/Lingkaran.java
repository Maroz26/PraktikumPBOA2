/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*File : Lingkaran.java */
/*Pertemuan : 5 */


public class Lingkaran extends BangunDatar implements IResize {
    private double jari;
    
    public Lingkaran(double diameter){
        this.jari = diameter / 2;
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


    
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100.0;
    }
}
