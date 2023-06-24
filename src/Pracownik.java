public class Pracownik extends Osoba{
    int identify;

    String zawod;

    @Override
    public String toString(){

        return "Pracownik: " +imie+" "+nazwisko+" id. : "+ identify+" "+ zawod;
    }
}
