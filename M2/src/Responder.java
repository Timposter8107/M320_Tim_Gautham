public class Responder {
    public Responder() {
    }

    public String generateResponse(String input) {
        if (input.contains("PC")) {
            return "Oh sieht nach einem PC Problem aus...";
        } else if (input.contains("Hilfe")) {
            return "Haben sie versucht den PC aus und wieder an zu schalten?";
        } else if (input.contains("Drucker")) {
            return "Haben sie dem Drucker alles gegeben was er braucht?";
        } else if (input.isEmpty()) {
            return "Sie müssen mir schon eine Frage stellen das ich ihnen helfen kann :(";
        } else if (input.contains("bug")) {
            return "Haben sie versucht das Prpogramm neu zu installieren?";
        } else if (input.contains("dankeschön")) {
            return "Kein Problem, ich helfe gerne :)";
        } else if (input.contains("anrufen")) {
            return "Tut mir leid wir sind nicht per Telefon erreichbar";
        } else if (input.contains("internet")) {
            return "Haben sie schon versucht ihren Router neu zu starten?";
        } else {
            return input.contains("Bildschirm") ? "Vielleicht haben sie ihn nicht eingesteckt." : "Das Problem ist nicht lösbar schmeissen sie den PC weg";
        }
    }
}
