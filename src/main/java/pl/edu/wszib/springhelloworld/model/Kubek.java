package pl.edu.wszib.springhelloworld.model;

public class Kubek {

    private boolean pelen = false;

    public void napelnij() {
        pelen = true;
    }

    public void wypij() {
        pelen = false;
    }

    public boolean pelen() {
        return pelen;
    }
}
