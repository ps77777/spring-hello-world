package pl.edu.wszib.springhelloworld.model;

import java.util.*;
import java.util.stream.Collectors;

public class Urna {

    private List<KartaDoGlosowania> karty = new ArrayList<>();

    public void wrzuc(KartaDoGlosowania kartaDoGlosowania) {
        karty.add(kartaDoGlosowania);
    }

    public void zlicz() {
        Map<Glos, Integer> iloscGlosow = Arrays.stream(Glos.values())
                .collect(Collectors.toMap(glos -> glos, glos -> 0));

        karty.forEach(karta -> iloscGlosow.put(karta.getGlos(), iloscGlosow.get(karta.getGlos()) + 1));

        iloscGlosow.keySet()
                .forEach(glos -> {
                    System.out.println(glos + " ilosc glosow : " + iloscGlosow.get(glos));
                });
    }

}
