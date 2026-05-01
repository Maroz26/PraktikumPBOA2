/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*File : Persegi.java */
/*Pertemuan : 5 */


public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(double sisi){
        super();
        this.sisi = sisi;

    }

    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setBorder(border);
        setWarna(warna);
        setJmlSisi(4);
    }


    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }


    @Override
    public double getLuas(){
        double luas = sisi * sisi;
        return luas;
    }

    @Override
    public double getKeliling(){
        double keliling = sisi * 4;
        return keliling;
    }

    public double getDiagonal(){
        double diagonal = Math.sqrt((sisi * sisi) + (sisi * sisi));
        return diagonal;
    }


    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : "+ sisi);
    }


    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }

}
