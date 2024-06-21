public class Yukata {
    private String imprimeu;
    public Yukata (String imprimeu) {
        this.imprimeu = imprimeu;
    }
    public String getImprimeu() {
        return imprimeu;
    }
    public String setImprimeu(String imprimeu) {
        return this.imprimeu = imprimeu;
    }
    @Override
    public String toString() {
        return "Yukata\nimprimeu: " + imprimeu +"\n";
    }
}
