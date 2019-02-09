package pl.edu.wszib.springhelloworld.model;

public class EkspresDoKawy {

    public void napelnij(Kubek kubek) {
        if(!kubek.pelen()) {
            kubek.napelnij();
            return;
        }

        System.out.println("Ten kubek jest juz pełen");
    }

}
