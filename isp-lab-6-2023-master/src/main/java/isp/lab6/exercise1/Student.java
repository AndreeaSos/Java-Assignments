package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String nume;
    private Catalog note;

    public Student(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Catalog getNote() {
        return note;
    }

    public void setNote(Catalog note) {
        this.note = note;
    }

}
