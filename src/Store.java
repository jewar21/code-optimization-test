public class Store {
    public static void main(String[] args) {

        //Definición de constantes
        final int SALES_TRESHOLD = 50;
        final int MAX_PRODUCTS = 3;

        //Definición de los arrelos con precios y cantitades
        int[] prices = {15, 10, 5};
        int[] quantities = {2, 3, 4};

        //Inicialización del contador con el total de ventas
        int totalSales = 0;

        //Ciclo para realizar las operaciones entre arreglos
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            totalSales += prices[i] * quantities[i];
        }

        //Verificación y salida de texto
        if (totalSales >= SALES_TRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
