public class TaxCalculation {
    public static void main(String[] args) {

        // definimos como constantes las tasas de impuestos y el umbral
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW = 0.10;
        final double TAX_THRESHOLD = 50.0;
        
        // utilizamos arrays para almacenar los precios y las tasas impositivas
        double [] productPrices ={100, 200};
        double [] taxRates = {TAX_RATE_LOW, TAX_RATE_HIGH};
        
        // utilizamos la variable totalTax para almacenar el impuesto total 
        double totalTax = 0.0 ;
        
        // creamos un ciclo para calcular el impuesto total
        for (int i = 0; i < productPrices.length; i++) {

            // calculamos el impuesto para cada producto y lo acumulamos
            totalTax += productPrices[i] * taxRates [i];
        }

        // comparamos el impuesto total con el umbral definido      
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("impuesto total alto:" + totalTax);
        }
        else {
            System.out.println("impuesto total bajo");
        }
    }
}
