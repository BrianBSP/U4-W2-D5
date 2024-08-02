package brianpelinku;

import java.util.ArrayList;
import java.util.List;

public class CatalogoBiblioteca {
    private List<Testo> catalogo;

    public CatalogoBiblioteca() {
        catalogo = new ArrayList<>();
    }

    public List<Testo> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Testo> catalogo) {
        this.catalogo = catalogo;
    }

    // metodi
    // aggiungi un elemento al catalogo
    public void aggiungiTesto(Testo testo) {
        catalogo.add(testo);
    }

    // rimuovi elemento tramite codice ISBN
    public void eliminaTesto(int codiceIsbn) {
        catalogo.removeIf(testo -> testo.getCodiceIsbn() == codiceIsbn);
    }

    // ricerca per ISBN
    public String cercaPerIsbn(int codiceIsbn) {
        return catalogo.stream().filter(testo -> testo.getCodiceIsbn() == codiceIsbn).toString();
    }

    // ricerca per anno di pubblicazione
    public String cercaPerAnnoPubblicazione(int annoPubblicazione) {
        return String.valueOf(catalogo.stream().filter(testo -> testo.getAnnoPubblicazione() == annoPubblicazione).findFirst());
    }

    // ricerca per autore
    public List<Libro> ricercaPerAutore(String autore) {
        return catalogo.stream()
                .filter(libro -> libro instanceof Libro)
                .map(libro -> (Libro) libro)
                .filter(libro -> libro.getAutore().equals(autore)).toList();
    }

    // salvataggio su disco
    // caricamento da disco in una nuova lista


}
