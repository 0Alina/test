package oop;

public class Student extends Specialitate {
    private String NP;

    public Student(String nume, String titlu, String NP) {
        super(nume, titlu);
        this.NP = NP;
    }
}
