public class TaxCalculation {
    public static void main(String[] args) {
        //precios de los productos//
        double productPrice1 = 100;
        double productPrice2 = 200;

        // tasas impositivas//
        double taxRate1 = 0.15;
        double taxRate2 = 0.10;

        // Cálculo de impuestos
        double tax1 = calculateTax(productPrice1, taxRate1);
        double tax2 = calculateTax(productPrice2, taxRate2);

        // Cálculo del impuesto total
        double totalTax = tax1 + tax2;

        // Evaluación del impuesto total
        if (totalTax > 50) {
            System.out.println("High total tax:: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }

    // Método para calcular el impuesto de un producto
    private static double calculateTax(double price, double taxRate) {
        return price * taxRate;
    }
}

