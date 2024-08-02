package brianpelinku;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
    public List<Testo> cercaPerIsbn(int codiceIsbn) {
        return catalogo.stream().filter(testo -> testo.getCodiceIsbn() == codiceIsbn).toList();
    }

    // ricerca per anno di pubblicazione
    public List<Testo> cercaPerAnnoPubblicazione(int annoPubblicazione) {
        return catalogo.stream().filter(testo -> testo.getAnnoPubblicazione() == annoPubblicazione).toList();
    }

    // ricerca per autore
    public List<Libro> ricercaPerAutore(String autore) {
        return catalogo.stream()
                .filter(libro -> libro instanceof Libro)
                .map(libro -> (Libro) libro)
                .filter(libro -> libro.getAutore().equals(autore)).toList();
    }

    // salvataggio su disco
    public void salvaProdottiSuDisco(List<CatalogoBiblioteca> catalogoBiblioteca, File file) throws IOException {

        StringBuilder stringa = new StringBuilder();

        for (Testo testo : catalogo) {
            stringa.append(catalogo.stream().map(Testo::getTitolo))
                    .append("@")
                    .append(catalogo.stream().map(Testo::getAnnoPubblicazione))
                    .append("@")
                    .append(catalogo.stream().map(Testo::getNumPagine))
                    .append("@")
                    .append(catalogo.stream().map(Testo::getCodiceIsbn))
                    .append(System.lineSeparator());
        }

        try {
            FileUtils.writeStringToFile(file,stringa.toString(), StandardCharsets.UTF_8,true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    // caricamento da disco in una nuova lista
    public void leggiCatalogoSuDisco(File file, List<CatalogoBiblioteca> catalogoBiblioteca) throws IOException {
        try {
            String contenutoFileCatalogo = FileUtils.readFileToString(file,StandardCharsets.UTF_8);
            String[] arrayContenutoFileCatalogo = contenutoFileCatalogo.split(System.lineSeparator());
            for (String stringa : arrayContenutoFileCatalogo){
                String[] stringaCatalogo = stringa.split("@");
                if ()
                Testo testo = new Libro()
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
