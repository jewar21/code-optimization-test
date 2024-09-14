import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {

        final int HIG_TAX = 50;
        
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Ingresa el valor del primer producto");
            int productPrice1 = scan.nextInt();

            System.out.println("Ingresa el porcentaje de impuesto");
            int taxPercentage1 = scan.nextInt();

            System.out.println("Ingresa el valor del segundo producto");
            int productPrice2 = scan.nextInt();

            System.out.println("Ingresa el porcentaje de impuesto");
            int taxPercentage2 = scan.nextInt();

        }
    }
}
