package oop;

public class Specialitate extends Facultate {
    private String titlu;

    public Specialitate (String nume, String titlu) {
        super(nume);
        this.titlu = titlu;
    }
    public void afisareSpecialitate() {
        System.out.println("Specialitatea: " + titlu);
    }

}
