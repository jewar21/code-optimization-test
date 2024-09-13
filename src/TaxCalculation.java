public class TaxCalculation {
    public static void main(String[] args) {
        /* asignamos las constantes que vamos a utilizar */
        final double TAX_RATE_HIGH  = 0.15;
        final double TAX_RATE_LOW = 0.10;
        final double TAX_THRESHOLD = 50;
        /* utilizamos un array para almacenar los precios de los productos */
        double[] productPrice = {100, 200};
        /* reemplazamos los valores magicos por las constantes  */
        double tax1 = productPrice[0] * TAX_RATE_HIGH;
        double tax2 = productPrice[1] * TAX_RATE_LOW;
        double totalTax = tax1 + tax2;
        
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}