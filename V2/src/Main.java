/**
 * @author Tim & Gautham
 *
 * Main Klasse
 */
public class Main {
    /**
     * Konstruktor
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Erstellung neuer Mannschaft inklusive Spieler
         */
        Mannschaft mannschaft = new Mannschaft();

        mannschaft.goalie.name = "Emma Davis";
        mannschaft.angreifer1.name = "Liam Turner";
        mannschaft.angreifer2.name = "Sophia Bennett";
        mannschaft.angreifer3.name = "Noah Harris";
        mannschaft.angreifer4.name = "Olivia Brooks";
        mannschaft.angreifer5.name = "Mason Wright";
        mannschaft.verteidiger1.name = "Ava Cooper";
        mannschaft.verteidiger2.name = "Lucas Foster";
        mannschaft.verteidiger3.name = "Mia Reed";
        mannschaft.verteidiger4.name = "Ethan Sanders";
        mannschaft.verteidiger5.name = "Charlotte Evans";

        mannschaft.spielerList.add(mannschaft.goalie);
        mannschaft.spielerList.add(mannschaft.angreifer1);
        mannschaft.spielerList.add(mannschaft.angreifer2);
        mannschaft.spielerList.add(mannschaft.angreifer3);
        mannschaft.spielerList.add(mannschaft.angreifer4);
        mannschaft.spielerList.add(mannschaft.angreifer5);
        mannschaft.spielerList.add(mannschaft.verteidiger1);
        mannschaft.spielerList.add(mannschaft.verteidiger2);
        mannschaft.spielerList.add(mannschaft.verteidiger3);
        mannschaft.spielerList.add(mannschaft.verteidiger4);
        mannschaft.spielerList.add(mannschaft.verteidiger5);

        mannschaft.spielerListAusgeben();
    }
}