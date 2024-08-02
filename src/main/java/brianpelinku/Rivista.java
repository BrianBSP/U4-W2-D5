package brianpelinku;

import brianpelinku.enums.Periodico;

public class Rivista extends Testo {
    // attributi
    Periodico periodico;

    public Rivista(String titolo, int annoPubblicazione, int numPagine, Periodico periodico) {
        super(titolo, annoPubblicazione, numPagine);
        this.periodico = periodico;
    }

    public Periodico getPeriodico() {
        return periodico;
    }

    @Override
    public String toString() {
        return "-------------Rivista-----------\n{" +
                "periodico= " + periodico +
                '}';
    }
}
