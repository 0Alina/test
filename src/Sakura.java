public class Sakura {
    private String specie;
    private String culoare;

    public Sakura (String specie, String culoare) {
        this.specie = specie;
        this.culoare = culoare;
    }
    public String getSpecie() {
        return specie;
    }
    public String setSpecie (String specie) {
        return this.specie = specie;
    }
    public String getCuloare() {
        return culoare;
    }
    public String setCuloare (String culoare) {
        return this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Sakura\nspecie: " + specie + "\nculoare: " + culoare +"\n";
    }
}
