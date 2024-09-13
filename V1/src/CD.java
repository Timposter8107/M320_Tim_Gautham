public class CD extends Medien {
    private String BandName;

    public CD(String titel, Integer jahr, Double preis, String bandname){
        super(titel, jahr, preis);
        this.BandName = bandname;
    }
}