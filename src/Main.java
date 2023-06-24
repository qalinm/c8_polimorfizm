import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("------Polimorfizm------");

        Osoba osoba = new Osoba();
        osoba.imie = "Kasia";
        osoba.nazwisko = "Śliczna";
        System.out.println(osoba);

        Pracownik pracownik = new Pracownik();
        pracownik.imie = "Alicja";
        pracownik.nazwisko="Majewska";
        pracownik.identify=1234;
        pracownik.zawod= "Piosenkarka";
        System.out.println(pracownik);
    }
}