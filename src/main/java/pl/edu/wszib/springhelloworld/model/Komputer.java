package pl.edu.wszib.springhelloworld.model;

public class Komputer {

    private StringBuilder praca = new StringBuilder();

    public void napisz(String tekst) {
        praca.append(tekst);
    }

    public String stan() {
        return praca.toString();
    }

}
