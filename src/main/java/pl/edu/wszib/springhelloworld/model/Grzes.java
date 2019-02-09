package pl.edu.wszib.springhelloworld.model;

public class Grzes extends Dziecko {

    public Grzes(Zabawka zabawka) {
        super(zabawka);
    }

    @Override
    public void odpakuj() {
        if(!(zabawka instanceof Samochodzik)) {
            throw new RuntimeException("Chciałem Samochodzik");
        }
    }

}
