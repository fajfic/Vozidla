public class Auto extends Vozidlo{
    public int getPocetDveri() {
        return pocetDveri;
    }

    public void setPocetDveri(int pocetDveri) {
        this.pocetDveri = pocetDveri;
    }

    private int pocetDveri;
    public Auto(int pocetDveri,String vyrobce,String spz,String model, int rokVyroby) {
        super(rokVyroby, model, vyrobce, spz);
        this.pocetDveri = pocetDveri;

    }
@Override
    public String toString() {
    return "spz: "+getSpz()+"vyrobce"+getVyrobce()+"model"+getModel()+"rok"+getRokVyroby()+"pocet dveri"+pocetDveri;
}
}

