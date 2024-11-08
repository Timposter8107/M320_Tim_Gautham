import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<iBuyable> productList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("a | add product");
            System.out.println("s | shopping cart");
            System.out.println("c | checkout");
            System.out.println("e | exit and cancel");

            char menuInput = sc.next().toLowerCase().charAt(0);

            switch (menuInput) {
                case 'a':
                    addProduct(sc, productList);
                    break;
                case 's':
                    if (productList.isEmpty()) {
                        System.out.println("No Products");
                    } else {
                        for (iBuyable product : productList) {
                            System.out.println(product.getClass().getName() + ": " + product.price() + " CHF");
                        }
                    }
                    break;
                case 'c':
                    if (productList.isEmpty()) {
                        System.out.println("No Products");
                    } else {

                        double finalPrice = 0;

                        System.out.println("----------------------");

                        for (iBuyable product : productList) {
                            System.out.println(product.getClass().getName() + ": " + product.price() + " CHF");
                            finalPrice += product.price();
                        }

                        DecimalFormat df = new DecimalFormat("#.##");

                        System.out.println("----------------------");
                        System.out.println(df.format(finalPrice) + " CHF");
                        System.out.println("----------------------");

                        return;
                    }
                    break;
                case 'e':
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    public static void addProduct(Scanner sc, ArrayList<iBuyable> productList) {
        System.out.println("a | Apple");
        System.out.println("b | Banana");
        System.out.println("c | Coke");
        System.out.println("m | Milk");

        char addInput = sc.next().toLowerCase().charAt(0);

        switch (addInput) {
            case 'a':
                productList.add(new Apple());
                break;
            case 'b':
                productList.add(new Banana());
                break;
            case 'c':
                productList.add(new Coke());
                break;
            case 'm':
                productList.add(new Milk());
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}