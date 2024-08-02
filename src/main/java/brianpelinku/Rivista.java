package brianpelinku;

import brianpelinku.enums.Periodico;

public class Rivista extends Testo {
    // attributi
    Periodico periodico;

    public Rivista(int codiceIsbn, String titolo, int annoPubblicazione, int numPagine, Periodico periodico) {
        super(codiceIsbn, titolo, annoPubblicazione, numPagine);
        this.periodico = periodico;
    }


    public Periodico getPeriodico() {
        return periodico;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRivista" +
                "\n{" +
                "periodico= " + periodico +
                '}';
    }
}
