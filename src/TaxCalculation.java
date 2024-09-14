import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {

        //Definición de constantes
        final int HIG_TAX = 50;
        final double percentageConverter = 0.01;
        
        try (Scanner scan = new Scanner(System.in)) {

            //Se le pide al usuario ingresar los datos
            System.out.println("Ingresa el valor del primer producto");
            int productPrice1 = scan.nextInt();

            System.out.println("Ingresa el porcentaje de impuesto");
            int taxPercentage1 = scan.nextInt();

            System.out.println("Ingresa el valor del segundo producto");
            int productPrice2 = scan.nextInt();

            System.out.println("Ingresa el porcentaje de impuesto");
            int taxPercentage2 = scan.nextInt();

            //Se hacen las operaciones para conocer el valor del impuesto
            double tax1 = productPrice1 * taxPercentage1 * percentageConverter;
            double tax2 = productPrice2 * taxPercentage2 * percentageConverter;
            double totalTax = tax1 + tax2;

            //Se hace un informe del impuesto
            System.out.println("\nTax value: $" + totalTax);

            //Se verifica si es alto o bajo según la constante
            if (totalTax >= HIG_TAX) {
                System.out.println("Hig tax");
            }
            else {
                System.out.println("Low tax");
            }
        }
    }
}
