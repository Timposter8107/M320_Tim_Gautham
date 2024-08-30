import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Anfangstemperatur eingeben");
        String temperature = userInput.next();

        System.out.println("Max Temperatur eingeben");
        String max = userInput.next();

        System.out.println("Min Temperatur eingeben");
        String min = userInput.next();

        Heizung heizung1 = new Heizung(Integer.parseInt(temperature), Integer.parseInt(min), Integer.parseInt(max));

        while (true) {
            System.out.println("");
            System.out.println("k | Kälter");
            System.out.println("w | Wärmer");
            System.out.println("e | Exit");
            switch(userInput.next().toLowerCase()) {
                case "k":
                    heizung1.colder();
                    break;

                case "w":
                    heizung1.warmer();
                    break;

                case "e":
                    return;

                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
            System.out.println("Temperatur: " + heizung1.getTemperature());
        }
    }
}