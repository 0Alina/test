public class Main {
    public static void main(String[] args) {
        Sakura sakura = new Sakura("Prunus serrulata (cireș japonez)", "roz");
        System.out.println(sakura);

        Yukata yukata = new Yukata("Carouri");
        System.out.println(yukata);

        Onigiri onigiri = new Onigiri("Somon");
        System.out.println(onigiri);

        //setteri
        sakura.setCuloare("Roșu");
        yukata.setImprimeu("Floral");
        onigiri.setUmplutura("Kimchi");

        //getteri
        System.out.println("Sakura culoare updated: " + sakura.getCuloare());
        System.out.println("Yukata imprimeu updated: " + yukata.getImprimeu());
        System.out.println("Onigiri umplutura updated: " + onigiri.getUmplutura());
    }
}