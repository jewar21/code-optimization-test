public class Quiz3 {

    // Fase 1 Reemplazo numeros magicos por constantes 
    static final double TAX_RATE_HIGH = 0.15;
    static final double TAX_RATE_LOW = 0.10;
    static final double TAX_THRESHOLD = 50.0;

    public static void main(String[] args) {

        // Fase 2 Diseño y arrays para almacenar los precios de los productos y los tipos 
        double[] productPrices = {100, 200};
        double[] taxRates = {TAX_RATE_HIGH, TAX_RATE_LOW};

        // Fase 3: Aplicación y calculo de los impuestos
        double totalTax = 0;
        for (int i = 0; i < productPrices.length; i++) {
            totalTax += productPrices[i] * taxRates[i];
        }

        // Fase 4 Comprobar si el impuesto total supera el limite 
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}

