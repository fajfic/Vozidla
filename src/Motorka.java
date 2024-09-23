public class Motorka extends Vozidlo {
    public String getTypMotoru() {
        return typMotoru;
    }

    public void setTypMotoru(String typMotoru) {
        this.typMotoru = typMotoru;
    }

    private String typMotoru;

    public Motorka(String typMotoru,String vyrobce,String spz,String model, int rokVyroby) {
        super(rokVyroby, model, vyrobce, spz);
        this.typMotoru = typMotoru;
    }
@Override
public String toString() {
    return "spz: "+getSpz()+"vyrobce"+getVyrobce()+"model"+getModel()+"rok"+getRokVyroby()+"typ motoru"+getTypMotoru();
}
}
