public class DVD extends Medien{
    private String FilmLaenge;

    public DVD(String titel, Integer jahr, Double preis, String filmlaenge){
        super(titel, jahr, preis);
        this.FilmLaenge = filmlaenge;
    }
}
