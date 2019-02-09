package pl.edu.wszib.springhelloworld.model;

public class Jas extends Dziecko {

    public Jas(Zabawka zabawka) {
        super(zabawka);
    }

    @Override
    public void odpakuj() {
        if(!(zabawka instanceof Klocki)) {
            throw new RuntimeException("Chciałem Klocki");
        }
    }

}
