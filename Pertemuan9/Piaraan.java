/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

import java.lang.reflect.AnnotatedTypeVariable;
import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        nbelm = 0;
        Lanabul = new LinkedList<>();
    }

    public int getNbelm(){
        return nbelm;
    }

    public void enqueueAnabul(Anabul A){
        Lanabul.add(A);
        nbelm = nbelm + 1;
    }

    public void dequeueAnabul(){
        Anabul sementara = Lanabul.poll();
        if(sementara != null){
            nbelm = nbelm - 1;
        }
    }

    public boolean isMember(Anabul A){
        if(Lanabul.contains(A)){
            return true;
        } else{
            return false;
        }
    }

    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    public void showAnabul(){
        for (Anabul A : Lanabul){
            System.out.println(A.getNama());
        }
    }

    public int countKucing(){
        int hitung = 0;
        for(Anabul A: Lanabul){
            if(A instanceof Kucing){
                hitung = hitung + 1;
            }
        }
        return hitung;
    }

    

    public double bobotKucing(){
        double berat = 0;
        for(Anabul A : Lanabul){
            if(A instanceof Kucing){
                berat = berat + ((Kucing)A).getBobot();
            }
        }
        return berat;
    }

    public void showJenisAnabul(){
        for(Anabul A : Lanabul){
            System.out.println("Nama " + A.getNama() + " -- Jenis anabul ini = " + A.getClass().getName());
        }
    }




}
