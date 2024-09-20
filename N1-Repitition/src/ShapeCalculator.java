public class ShapeCalculator {
    public static void viereckCalc(Double dSeiteEins, Double dSeiteZwei) {
        Double dFlaeche;
        Double dUmfang;

        dFlaeche = dSeiteEins * dSeiteZwei;
        dUmfang = (dSeiteEins * 2) + (dSeiteZwei * 2);

        System.out.println("Fläche: " + dFlaeche + ", Umfang: " + dUmfang);
    }

    public static void dreieckCalc(Double dSeiteEins, Double dSeiteZwei, Double dWinkelEins) {
        Double dSeiteDrei;

        dSeiteDrei = Math.sqrt((dSeiteEins * dSeiteEins) + (dSeiteZwei * dSeiteZwei)
                - 2 * dSeiteEins * dSeiteZwei * Math.cos(Math.toRadians(dWinkelEins)));

        System.out.println("Länge der dritten Seite: " + dSeiteDrei);
    }
}
