package pl.edu.wszib.springhelloworld.model;

public abstract class Dziecko {

    protected Zabawka zabawka;

    public Dziecko(Zabawka zabawka) {
        this.zabawka = zabawka;
    }

    public abstract void odpakuj();

}
