public class Quiz2 {

    // 1 Reemplazar numeros magicos con nombres de constantes
    static final int PRODUCT_1_PRICE = 15;
    static final int PRODUCT_2_PRICE = 10;
    static final int PRODUCT_3_PRICE = 5;
    static final int QUANTITY_1 = 2;
    static final int QUANTITY_2 = 3;
    static final int QUANTITY_3 = 4;
    static final int SALES_THRESHOLD = 50;

    public static void main(String[] args) {

        // 2 Diseño e Implementacion
        // Arrays para almacenar precios y cantidades de productos
        int[] productPrices = {PRODUCT_1_PRICE, PRODUCT_2_PRICE, PRODUCT_3_PRICE};
        int[] productQuantities = {QUANTITY_1, QUANTITY_2, QUANTITY_3};

        // variable de las ventas totales de la tienda
        int totalSales = 0;

        // calcular ventas totales usando ciclo repetitivo for
        for (int i = 0; i < productPrices.length; i++) {
            totalSales += productPrices[i] * productQuantities[i];
        }

        // 4 Comprobar resultados de las ventas
        if (totalSales > SALES_THRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}

