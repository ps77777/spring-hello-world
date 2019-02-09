package pl.edu.wszib.springhelloworld.model;

public class Ciastko {

    private boolean ugryzione = false;

    public void ugryz() {
        ugryzione = true;
    }

    public boolean ugryzione() {
        return ugryzione;
    }
}
