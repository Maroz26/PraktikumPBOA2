/*Nama : Ammar Rozan Rusyaidan */
/*NIM : 24060124140147 */
/*Kelas : A */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    
    private int nbelm;
    private List<String> Lnama;


    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }
    
    /*addNama adalah prosedur untuk menambah elemen berupa string nama ke dalam antrian Lnama */
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm = nbelm + 1;
    }

    /*delNama adalah prosedur untuk mengurangi elemen berupa string nama dari antrian Lnama */
    public void delNama(String nama){
        Lnama.remove(nama);
        nbelm = nbelm - 1;
    }

    

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama_lama, String nama_baru){
        for(int i=0; i< Lnama.size(); i++){
            if(Lnama.get(i).contains(nama_lama)){
                Lnama.set(i, nama_baru);
                break;
            }
        }
    }


    public int countNama(String nama){
        int banyaknya = 0;
        for(String n : Lnama){
            if(n.equals(nama)){
                banyaknya++;
            }

        }
        return banyaknya;
    }



    public void showTeman(){
        for (String nama : Lnama){
            System.out.println(nama);
        }
    }
}
