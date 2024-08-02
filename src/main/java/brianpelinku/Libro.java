package brianpelinku;

public class Libro extends Testo {
    // attributi
    private String autore;
    private String genere;

    // costruttore
    public Libro(String titolo, int annoPubblicazione, int numPagine, String autore, String genere) {
        super(titolo, annoPubblicazione, numPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "-------------Libro-----------\n{" +
                "autore= '" + autore + '\'' +
                ", \ngenere= '" + genere + '\'' +
                '}';
    }
}
