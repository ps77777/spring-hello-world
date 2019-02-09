package pl.edu.wszib.springhelloworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.*;

@Configuration
public class MainConfiguration {

    @Bean
    public Dziecko jas(Zabawka zabawka) {
        Dziecko jas = new Jas(zabawka);
        jas.odpakuj();
        return jas;
    }

    @Bean
    public Dziecko malgosia(Zabawka zabawka) {
        Dziecko malgosia = new Malgosia(zabawka);
        malgosia.odpakuj();
        return malgosia;
    }

    @Bean
    public Dziecko grzes(Zabawka zabawka) {
        Dziecko grzes = new Grzes(zabawka);
        grzes.odpakuj();
        return grzes;
    }

}
