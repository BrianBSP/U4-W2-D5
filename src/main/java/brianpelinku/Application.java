package brianpelinku;

import brianpelinku.enums.Genere;
import brianpelinku.enums.Periodico;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        CatalogoBiblioteca catalogoBiblioteca = new CatalogoBiblioteca();

        //int codIsbn = random.nextInt(1000, 10000000);
        //List<Testo> catalogo = new ArrayList<>();
        //Faker faker = new Faker(Locale.ITALIAN);
        // creao libri nel catalogo
        /*Libro libro1 = new Libro(codIsbn, "Harry Potter 1", 2005, 250, "J.K. Rowling", Genere.AVVENTURA);
        Libro libro2 = new Libro(codIsbn, "Harry Potter 2", 2006, 250, "J.K. Rowling", Genere.AVVENTURA);
        Libro libro3 = new Libro(codIsbn, "Harry Potter 3", 2007, 250, "J.K. Rowling", Genere.AVVENTURA);
        Libro libro4 = new Libro(codIsbn, "Harry Potter 4", 2008, 250, "J.K. Rowling", Genere.AVVENTURA);
        Libro libro5 = new Libro(codIsbn, "Harry Potter 5", 2009, 250, "J.K. Rowling", Genere.AVVENTURA);
        Libro libro6 = new Libro(codIsbn, "Harry Potter 6", 2010, 250, "J.K. Rowling", Genere.AVVENTURA);*/

        // aggiunti nell'arrayList
        /*catalogo.add(libro1);
        catalogo.add(libro2);
        catalogo.add(libro3);
        catalogo.add(libro4);
        catalogo.add(libro5);
        catalogo.add(libro6);*/
        // creo riviste
        /*Rivista rivista1 = new Rivista(codIsbn, "Donna Moderna", 2000, 10, Periodico.MENSILE);
        Rivista rivista2 = new Rivista(codIsbn + 1, "TV Sorrisi e Canzoni", 2000, 10, Periodico.MENSILE);
        Rivista rivista3 = new Rivista(codIsbn, "Chi", 2000, 10, Periodico.MENSILE);*/
        /*catalogo.add(rivista1);
        catalogo.add(rivista2);
        catalogo.add(rivista3);*/

        // aggiunti elementi nel catalogo


        /*catalogoBiblioteca.aggiungiTesto(libro1);
        catalogoBiblioteca.aggiungiTesto(libro2);
        catalogoBiblioteca.aggiungiTesto(libro3);
        catalogoBiblioteca.aggiungiTesto(libro4);
        catalogoBiblioteca.aggiungiTesto(libro5);
        catalogoBiblioteca.aggiungiTesto(libro6);
        catalogoBiblioteca.aggiungiTesto(rivista1);
        catalogoBiblioteca.aggiungiTesto(rivista2);
        catalogoBiblioteca.aggiungiTesto(rivista3);*/

        /*for (Testo catalogo : catalogoBiblioteca.getCatalogo()) {
            System.out.println(catalogo);
        }*/

        // aggiungi un testo(libro/rivista) nel catalogo da scanner
        System.out.println("Inserisci il tipo di elemento che vuoi aggiungere al catalogo:\n1. Libro\n2. Rivista");
        int tipo = Integer.parseInt(scanner.nextLine());

        int isbn = random.nextInt(1000, 10000000);
        System.out.println("Codice ISBN: " + isbn);

        System.out.println("Inserisci il titolo: ");  // non mi fa inserire da scanner il titolo
        String titolo = scanner.nextLine();

        System.out.println("Inserisci L'anno di pubblicazione: ");
        int annoPubb = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci il numero delle pagine: ");
        int numPag = Integer.parseInt(scanner.nextLine());

        if (tipo == 1) {
            System.out.println("Inserisci l'autore: ");
            String autore = scanner.nextLine();

            System.out.println("Inserisci il genere: 1.ROMANTICO 2.THRILLER 3.GIALLO 4.HORROR 5.AVVENTURA 6.FANTASY");
            int gen = Integer.parseInt(scanner.nextLine());
            Genere genere = switch (gen) {
                case 1 -> Genere.ROMANTICO;
                case 2 -> Genere.THRILLER;
                case 3 -> Genere.GIALLO;
                case 4 -> Genere.HORROR;
                case 5 -> Genere.AVVENTURA;
                case 6 -> Genere.FANTASY;
                default -> null;
            };
            catalogoBiblioteca.aggiungiTesto(new Libro(isbn, titolo, annoPubb, numPag, autore, genere));
        } else {
            System.out.println("Inserisci la periodicità: 1. SETTIMANALE 2. MENSILE 3. SEMESTRALE");
            int periodo = Integer.parseInt(scanner.nextLine());
            Periodico periodico = switch (periodo) {
                case 1 -> Periodico.SETTIMANALE;
                case 2 -> Periodico.MENSILE;
                case 3 -> Periodico.SEMETRALE;
                default -> null;
            };
            catalogoBiblioteca.aggiungiTesto(new Rivista(isbn, titolo, annoPubb, numPag, periodico));
        }
        // stampo per vedere se mi effettivamente aggiunto il libro
        for (Testo catalogo : catalogoBiblioteca.getCatalogo()) {
            System.out.println(catalogo);
        }
        // elimina elemento
        System.out.println("Elimina un elemento dal catalogo: inserisci il codice ISBN");
        int isbnRimuovi = Integer.parseInt(scanner.nextLine());
        catalogoBiblioteca.eliminaTesto(isbnRimuovi);

        // cerca per ISBN
        System.out.println("Cerca per ISBN: ");
        int isbnCerca = Integer.parseInt(scanner.nextLine());
        Optional<CatalogoBiblioteca> testo = catalogoBiblioteca.cercaPerIsbn(isbnCerca);
        testo.ifPresent(System.out::println);

        // cerca per nome autore
        System.out.println("Inserisci il nome dell'autore che vuoi cercare: ");
        String autoreCerca = scanner.nextLine();
        List<Libro> libri = catalogoBiblioteca.ricercaPerAutore(autoreCerca);
        libri.forEach(System.out::println);

        //


    }


}
