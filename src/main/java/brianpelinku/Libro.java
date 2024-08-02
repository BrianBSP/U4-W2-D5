package brianpelinku;

import brianpelinku.enums.Genere;

public class Libro extends Testo {
    // attributi
    private String autore;
    private Genere genere;

    public Libro(int codiceIsbn, String titolo, int annoPubblicazione, int numPagine, String autore, Genere genere) {
        super(codiceIsbn, titolo, annoPubblicazione, numPagine);
        this.autore = autore;
        this.genere = genere;
    }

    // costruttore


    public String getAutore() {
        return autore;
    }

    public Genere getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLibro\n{" +
                "autore= '" + autore + '\'' +
                ", \ngenere= '" + genere + '\'' +
                '}';
    }
}
