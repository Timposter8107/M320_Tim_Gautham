import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flug flug = new Flug();

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("p  | Passagier hinzufügen");
            System.out.println("a  | Alle Passagiere ansehen");
            System.out.println("e  | Exit");

            String hauptmenuEingabe = sc.next();

            switch (hauptmenuEingabe) {
                case "p":
                    Passagier passagier = new Passagier();

                    System.out.println("Bitte Namen eingeben");

                    passagier.setName(sc.next());

                    flug.passagiere.add(passagier);
                    break;
                case "a":
                    if (flug.passagiere.isEmpty()) {
                        System.out.println("Keine Passagiere auf diesem Flug");
                    }
                    else {
                        flug.passagierListAusgeben();
                    }
                    break;
                case "e":
                    return;
            }
}
    }
}