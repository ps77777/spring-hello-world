package pl.edu.wszib.springhelloworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.Programista;

import java.util.Arrays;

@Configuration
public class ExecConfiguration {

    @Bean
    public String execute(Programista marek, Programista lukasz, Programista maciej) {
        Arrays.asList(maciej, marek, lukasz)
                .forEach(programista -> {
                    new Thread(() -> {
                        while(true) {
                            programista.podejdzDoEkspresu();
                            programista.pracuj();
                            programista.napijSieKawy();
                        }
                    }).start();
                });
        return "";
    }

}
