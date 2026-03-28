import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Dosen_tetap D0 = new Dosen_tetap(
                "9545647548",
                "Rozan",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "FSM",
                "78647324"
        );

        D0.printInfo();

        Tendik T0 = new Tendik(
            "T001",
           "Budi", 
                LocalDate.of(1980, 5, 10),
                LocalDate.of(2010, 1, 1), 
                5000000, 
                "Administrasi");

        T0.printInfo();

        Tendik T1 = new Tendik();
        T1.setBidang("Keuangan");
        T1.printInfo();

        
    }
}