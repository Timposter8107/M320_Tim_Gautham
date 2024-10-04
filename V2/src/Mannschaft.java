import java.util.ArrayList;
import java.util.List;

public class Mannschaft {
    List<Spieler> spielerList = new ArrayList<Spieler>();

    void spielerListAusgeben() {
        for (Spieler s : spielerList) {
            s.zeigeName();
        }
    }
}
