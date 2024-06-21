public class Onigiri {
    private String umplutura;
    public Onigiri(String umplutura) {
        this.umplutura = umplutura;
    }
    public String getUmplutura () {
        return umplutura;
    }
    public String setUmplutura (String umplutura) {
        return this.umplutura = umplutura;
    }
    @Override
    public String toString() {
        return "Onigiri\numplutura: " + umplutura +"\n";
    }
}
