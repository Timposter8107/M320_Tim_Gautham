public class Buch extends Medien{
    private String ISBN;

    public Buch(String titel, Integer jahr, Double preis, String isbn){
        super(titel, jahr, preis);
        this.ISBN = isbn;
    }
}
