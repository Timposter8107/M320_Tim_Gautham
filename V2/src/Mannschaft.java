import java.util.ArrayList;
import java.util.List;

/**
 * @author Tim & Gautham
 *
 * Mannschafts-Klasse
 */
public class Mannschaft {
    List<Spieler> spielerList = new ArrayList<Spieler>();

    Spieler goalie = new Goalie();

    Spieler angreifer1 = new Angreifer();
    Spieler angreifer2 = new Angreifer();
    Spieler angreifer3 = new Angreifer();
    Spieler angreifer4 = new Angreifer();
    Spieler angreifer5 = new Angreifer();

    Spieler verteidiger1 = new Verteidiger();
    Spieler verteidiger2 = new Verteidiger();
    Spieler verteidiger3 = new Verteidiger();
    Spieler verteidiger4 = new Verteidiger();
    Spieler verteidiger5 = new Verteidiger();

    /**
     * Methode zur Ausgabe der Spieler Liste
     */
    void spielerListAusgeben() {
        for (Spieler s : spielerList) {
            s.zeigeName();
            s.spielen();
            System.out.println();
        }
    }
}
