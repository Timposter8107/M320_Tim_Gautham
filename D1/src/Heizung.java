import javax.swing.*;

public class Heizung {

    private int temperature;
    private int min;
    private int max;
    private int increment = 5;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Heizung(int temperature, int min, int max) {
        this.temperature = temperature;
        this.min = min;
        this.max = max;
    }

    public void colder() {
        temperature -= increment;
        if (temperature < min)
        {
            System.out.println("Temperatur unter Minimum");
            temperature = min;
        }
    }

    public void warmer() {
        temperature += increment;
        if (temperature > max)
        {
            System.out.println("Temperatur über Maximum");
            temperature = max;
        }
    }
}
