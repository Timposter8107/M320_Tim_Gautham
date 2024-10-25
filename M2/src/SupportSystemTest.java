import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SupportSystemTest {
    SupportSystemTest() {
    }

    @Test
    void generateResponseTest() {
        Responder responder = new Responder();
        String output = responder.generateResponse("Ich brauche Hilfe!");
        Assertions.assertEquals(output, "Haben sie versucht den PC aus und wieder an zu schalten?");
    }

    @Test
    void generateResponseTest2() {
        Responder responder = new Responder();
        String output = responder.generateResponse("Mein Drucker funktioniert nicht.");
        Assertions.assertEquals(output, "Haben sie dem Drucker alles gegeben was er braucht?");
    }

    @Test
    void generateResponseTest3() {
        Responder responder = new Responder();
        String output = responder.generateResponse("kjladfsijoadfsijpoadfskjlödfsa");
        Assertions.assertEquals(output, "Das Problem ist nicht lösbar schmeissen sie den PC weg");
    }

    @Test
    void generateResponseTest4() {
        Responder responder = new Responder();
        String output = responder.generateResponse("");
        Assertions.assertEquals(output, "Sie müssen mir schon eine Frage stellen das ich ihnen helfen kann :(");
    }
}
