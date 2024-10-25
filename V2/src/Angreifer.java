/**
 * @author Tim & Gautham
 *
 * Angreifer Klasse
 */
public class Angreifer extends Spieler {
    /**
     * Methode zur Beschreibung des Angreifers auf dem Spielfeld
     */
    @Override
    void spielen() {
        System.out.println("Angreifer");
        System.out.println("Greift gegnerisches Team an");
    }
}
