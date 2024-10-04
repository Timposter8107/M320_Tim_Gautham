import java.util.ArrayList;
import java.util.List;

public class Flug {
    List<Passagier> passagiere = new ArrayList<Passagier>();

    void passagierListAusgeben() {
        for (Passagier p : passagiere) {
            p.nameAusgeben();
        }
    }
}