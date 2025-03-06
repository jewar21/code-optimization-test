import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {

        final int TAX_THRESHOLD = 50;
        final double TAX_RATE_HIGH = 0.10;
        final double TAX_RATE_LOW = 0.15;

        int[] products;
        double[] taxes;
        double taxesSum = 0;
        
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.println("Ingresa la cantidad de productos");
            int productsAmount = scan.nextInt();
            products = new int[productsAmount];
            taxes = new double[productsAmount];

            for (int i = 0; i < products.length; i++) {
                System.out.println("Ingresa el precio del producto " + (i+1));
                products[i] = scan.nextInt();

                int taxOption;

                do { 
                    System.out.println("\n1 = impuesto es alto (15%)");
                    System.out.println("2 = impuesto es bajo (10%)");
                    taxOption = scan.nextInt();

                    switch (taxOption) {
                        case 1:
                            taxes[i] = TAX_RATE_HIGH;
                            break;
                        case 2:
                            taxes[i] = TAX_RATE_LOW;
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                } while ((taxOption != 1) && (taxOption != 2));

                taxesSum += products[i] * taxes[i];
            }
            System.out.println("El valor de los impuestos es de: $" + taxesSum);
            if (taxesSum > TAX_THRESHOLD){
                System.out.println("El impuesto sobrepasa el umbral");
            }
            else {
                System.out.println("El impuesto no sobrepasa el umbral");
            }
        }
    }
}
