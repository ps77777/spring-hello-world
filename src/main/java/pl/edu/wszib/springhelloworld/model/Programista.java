package pl.edu.wszib.springhelloworld.model;

import pl.edu.wszib.springhelloworld.util.StringUtil;

public class Programista {

    private Kubek kubek;
    private Komputer komputer;
    private EkspresDoKawy ekspresDoKawy;

    private StringBuilder coNapisalem = new StringBuilder();

    public Programista(Kubek kubek, Komputer komputer, EkspresDoKawy ekspresDoKawy) {
        this.kubek = kubek;
        this.komputer = komputer;
        this.ekspresDoKawy = ekspresDoKawy;
    }

    public void podejdzDoEkspresu() {
        ekspresDoKawy.napelnij(kubek);
    }

    public void pracuj() {
        String praca = StringUtil.random();
        komputer.napisz(praca);
        coNapisalem.append(praca);

        if(!coNapisalem.toString().equals(komputer.stan())) {
            System.out.println("Ej, nie to napisałem!!!");
        }
    }

    public void napijSieKawy() {
        if(kubek.pelen()) {
            kubek.wypij();
            return;
        }

        System.out.println("Ej, kto pił z mojego kubka ?");
    }

}
