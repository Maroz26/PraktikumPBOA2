/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*File : Persegi.java */


public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
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

    public double getLuas(){
        double luas = sisi * sisi;
        return luas;
    }

    
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



}
