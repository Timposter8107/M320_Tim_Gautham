public class SupportSystem {
    private InputReader reader = new InputReader();
    private Responder responder = new Responder();

    public SupportSystem() {
    }

    public void start() {
        boolean finished = false;
        this.printWelcome();

        while(!finished) {
            String input = this.reader.getInput();
            if (input.contains("exit")) {
                finished = true;
            } else {
                String response = this.responder.generateResponse(input);
                System.out.println(response);
            }
        }

        this.printGoodbye();
    }

    public void printWelcome() {
        System.out.println("Willkommen zum IT Support");
        System.out.println();
        System.out.println("Bitte lassen sie uns wissen was ihr Problem ist");
        System.out.println("Wir werden ihnen versuchen so gut wie es geht zu helfen");
        System.out.println("Bitte schreiben sie 'exit' um den IT SUpport zu beenden");
    }

    public void printGoodbye() {
        System.out.println("Ich hoffe ich konnte helfen :) Tschüss...");
    }
}
