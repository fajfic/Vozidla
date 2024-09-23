public class Vozidlo {
    private String spz;
    private String vyrobce;
    private String model;
    private int rokVyroby;

    public Vozidlo(int rokVyroby, String model, String vyrobce, String spz) {
        this.rokVyroby = rokVyroby;
        this.model = model;
        this.vyrobce = vyrobce;
        this.spz = spz;
    }
    public String toString(){
        return "spz: "+spz+"vyrobce"+vyrobce+"model"+model+"rok"+rokVyroby;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }




}
