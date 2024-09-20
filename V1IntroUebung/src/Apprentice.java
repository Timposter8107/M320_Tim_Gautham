public class Apprentice extends Human{

    private String topic;

    public Apprentice(String topic, String name){
        super(name);
        this.topic = topic;

    }

    public void printName() {
        System.out.println(getName());
    }
}
