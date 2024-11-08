public class Main {
    public static void main(String[] args) {
        Figur krieger = new Krieger();
        Figur magier = new Magier();
        Figur schurke = new Schurke();

        IWaffenVerhalten stab = new StabVerhalten();
        IWaffenVerhalten axt = new AxtVerhalten();
        IWaffenVerhalten dolch = new DolchVerhalten();

        krieger.setCharacterName("Harald");
        krieger.setWaffe(stab);

        magier.setCharacterName("Willi");
        magier.setWaffe(dolch);

        schurke.setCharacterName("Josef");
        schurke.setWaffe(axt);

        ausgabe(krieger);
        System.out.println();
        ausgabe(magier);
        System.out.println();
        ausgabe(schurke);
    }

    public static void ausgabe(Figur figur) {
        System.out.println(figur.getCharacterName());
        System.out.println(figur.getClass().getName());
        figur.kaempfen();
    }
}