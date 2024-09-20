import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("r | Rechteck / Quadrat");
            System.out.println("d | Dreieck");

            String sForm = sc.next();

            if (sForm.equals("r")) {
                String sSeiteEins;
                String sSeiteZwei;
                System.out.println("Erste Seite eingeben");
                sSeiteEins = sc.next();

                System.out.println("Zweite Seite eingeben (0 schreiben für Quadrat)");
                sSeiteZwei = sc.next();

                if (sSeiteZwei.equals("0")) {
                    sSeiteZwei = sSeiteEins;
                }

                Double dSeiteEins = Double.parseDouble(sSeiteEins);
                Double dSeiteZwei = Double.parseDouble(sSeiteZwei);

                ShapeCalculator.viereckCalc(dSeiteEins, dSeiteZwei);
            }
            else if (sForm.equals("d")){
                Double dSeiteEins;
                Double dSeiteZwei;
                Double dWinkelEins;
                System.out.println("Erste Seite eingeben");
                dSeiteEins = Double.parseDouble(sc.next());
                System.out.println("Zweite Seite eingeben");
                dSeiteZwei = Double.parseDouble(sc.next());
                System.out.println("Bekannten Winkel eingeben");
                dWinkelEins = Double.parseDouble(sc.next());

                ShapeCalculator.dreieckCalc(dSeiteEins, dSeiteZwei, dWinkelEins);
            }
        }
    }
}