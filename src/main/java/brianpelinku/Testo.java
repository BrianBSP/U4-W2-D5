package brianpelinku;

import java.util.ArrayList;
import java.util.List;

public abstract class Testo {
    // attributi
    private int codiceIsbn;
    private String titolo;
    private int annoPubblicazione;
    private int numPagine;

    // costruttori
    public Testo(int codiceIsbn, String titolo, int annoPubblicazione, int numPagine) {
        //Random random = new Random();
        this.codiceIsbn = codiceIsbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numPagine = numPagine;
    }

    public void catalogoBiblioteca() {
        List<Testo> catalogo = new ArrayList<>();
    }

    // getter e setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getCodiceIsbn() {
        return codiceIsbn;
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

