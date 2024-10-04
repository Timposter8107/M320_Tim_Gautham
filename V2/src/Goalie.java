public class Goalie extends Spieler {
    double koerperGroesse;

    @Override
    void spielen() {
        System.out.println("Goalie");
        System.out.println("Beschützt das Goal");
    }
}
