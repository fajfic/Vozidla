import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Auto auto=new Auto(5,"BMW","P78HC23","M5",2016);
        Motorka motorka=new Motorka("ctyrtakt","Java","A87CD24","RSX9000",2005);
        ArrayList<Vozidlo>vozidla=new ArrayList<>();
        vozidla.add(auto);
        vozidla.add(motorka);
        for (Vozidlo v:vozidla){
            System.out.println(v);
        }

    }
}
