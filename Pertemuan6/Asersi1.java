public class Asersi1 {
    public static void main(String[] args){
        int x = -9;
        if(x > 0){
            System.out.println("x bilangan positif!");
        } else {
            assert(x<0):"Ada kesalahan logika!";
            System.out.println("x bilangan negatif!");
        }
    }
}