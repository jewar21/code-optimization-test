public class Store {
    public static void main(String[] args) {
        int[] productPrices = {10, 25, 5};                        /*Array para almacenar los precios de los productos */

        int[] multipliers = {2, 3, 4};                          /*Modificado a array los multiplicadores */
        final int MINIMUMSALES = 50;

        int total1 = productPrices[0] * multipliers[0];
        int total2 = productPrices[1] * multipliers[1];          /*Consulta los precios en el array y los multiplicadores */
        int total3 = productPrices[2] * multipliers[2];

        int totalSales = total1 + total2 + total3;
        System.out.println();                                   /*Salto de linea para mejorar la visual en la terminal */
        
        if (totalSales > MINIMUMSALES) {
            System.out.println("Good sales performance");
            System.out.println();                               /*Salto de linea para mejorar la visual en la terminal */
        } else {                                                /*Si el total de las ventas es mayor o menor al valor de ventas minimo mostrara un mensaje de ventas */
            System.out.println("Low sales performance");
            System.out.println();                               /*Salto de linea para mejorar la visual en la terminal */
        }
    }
}
