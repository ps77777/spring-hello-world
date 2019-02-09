package pl.edu.wszib.springhelloworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.EkspresDoKawy;
import pl.edu.wszib.springhelloworld.model.Komputer;
import pl.edu.wszib.springhelloworld.model.Kubek;
import pl.edu.wszib.springhelloworld.model.Programista;

@Configuration
public class MainConfiguration {

    @Bean
    public Programista marek(Kubek kubek, Komputer komputer, EkspresDoKawy ekspresDoKawy) {
        return new Programista(kubek, komputer, ekspresDoKawy);
    }

    @Bean
    public Programista maciej(Kubek kubek, Komputer komputer, EkspresDoKawy ekspresDoKawy) {
        return new Programista(kubek, komputer, ekspresDoKawy);
    }

    @Bean
    public Programista lukasz(Kubek kubek, Komputer komputer, EkspresDoKawy ekspresDoKawy) {
        return new Programista(kubek, komputer, ekspresDoKawy);
    }

}
