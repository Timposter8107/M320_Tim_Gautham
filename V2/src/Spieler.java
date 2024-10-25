/**
 * @author Tim & Gautham
 *
 * Spieler Base-Klasse
 */
public class Spieler {
    String name;

    /**
     * Methode zur Ausgabe des Spieler-Namens im Terminal
     */
    void zeigeName() {
        System.out.println(name);
    }

    /**
     * Methode zur allgemeinen Beschreibung eines Spielers auf dem Spielfeld
     */
    void spielen() {
        System.out.println("Spieler spielt auf dem Spielfeld");
    }
}
