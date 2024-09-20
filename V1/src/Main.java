import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<Medien> MedienList = new ArrayList<>();
        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("a | Alle Medien anzeigen");
            System.out.println("h | Medien hinzufügen");
            System.out.println("e | Beenden");

            String methodInput = sc.next();
            switch (methodInput.toLowerCase()){
                case "a":
                    if (MedienList.isEmpty()){
                        System.out.println("Keine Medien");
                    }
                    else {
                        for (Medien medien : MedienList){
                            System.out.println(medien.getTitel() + ", " + medien.getJahr().toString() + ", " + medien.getPreis().toString());
                        }
                    }
                    break;
                case "h":
                    System.out.println("Medientyp auswählen");
                    System.out.println("d | DVD");
                    System.out.println("c | CD");
                    System.out.println("b | Buch");

                    String medienTyp = sc.next();

                    String titel;
                    String jahr;
                    String preis;

                    switch (medienTyp.toLowerCase()) {
                        case "d":
                            System.out.println("Titel eingeben");
                            titel = sc.next();
                            System.out.println("Jahrgang eingeben");
                            jahr = sc.next();
                            System.out.println("Preis eingeben");
                            preis = sc.next();
                            System.out.println("Länge eingeben");
                            String laenge = sc.next();
                            DVD dvd = new DVD(titel, Integer.parseInt(jahr), Double.parseDouble(preis), laenge);

                            MedienList.add(dvd);
                            break;
                        case "c":
                            System.out.println("Titel eingeben");
                            titel = sc.next();
                            System.out.println("Jahrgang eingeben");
                            jahr = sc.next();
                            System.out.println("Preis eingeben");
                            preis = sc.next();
                            System.out.println("Band Name eingeben");
                            String bandname = sc.next();
                            CD cd = new CD(titel, Integer.parseInt(jahr), Double.parseDouble(preis), bandname);
                            MedienList.add(cd);
                            break;
                        case "b":
                            System.out.println("Titel eingeben");
                            titel = sc.next();
                            System.out.println("Jahrgang eingeben");
                            jahr = sc.next();
                            System.out.println("Preis eingeben");
                            preis = sc.next();
                            System.out.println("ISBN-Nummer eingeben");
                            String isbn = sc.next();
                            Buch buch = new Buch(titel, Integer.parseInt(jahr), Double.parseDouble(preis), isbn);
                            MedienList.add(buch);
                            break;
                        default:
                            System.out.println("Ungültige Eingabe");
                            return;
                    }
                    break;
                case "e":
                    return;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
        }
    }
}