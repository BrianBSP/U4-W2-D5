package brianpelinku;

import java.util.Random;

public abstract class Testo {
    // attributi
    private int codiceIsbn;
    private String titolo;
    private int annoPubblicazione;
    private int numPagine;

    // costruttori
    public Testo(String titolo, int annoPubblicazione, int numPagine) {
        Random random = new Random();
        this.codiceIsbn = random.nextInt(1000, 10000000);
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numPagine = numPagine;
    }

    // getter e setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    // toString

    @Override
    public String toString() {
        return "------------------------------" +
                "\n{codiceIsbn= " + codiceIsbn +
                ", \ntitolo='" + titolo + '\'' +
                ", \nannoPubblicazione=" + annoPubblicazione +
                ", \nnumPagine=" + numPagine +
                '}';
    }
}

