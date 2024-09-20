import java.util.ArrayList;

public class Medien {
    public ArrayList<Medien> MedienList = new ArrayList<>();
    private String Titel;
    private Integer Jahr;
    private Double Preis;

    public Medien(String titel, int jahr, double preis) {
        this.Titel = titel;
        this.Jahr = jahr;
        this.Preis = preis;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public Integer getJahr() {
        return Jahr;
    }

    public void setJahr(Integer jahr) {
        Jahr = jahr;
    }

    public Double getPreis() {
        return Preis;
    }

    public void setPreis(Double preis) {
        Preis = preis;
    }
}