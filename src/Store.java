public class Store {
    public static void main(String[] args) {
        //precio de los productos//
        int p1 = 20;
        int p2 = 15;
        int p3 = 10;

         // Cantidad de cada producto vendido
        int cantidad1 = 2;
        int cantidad2 = 3;
        int cantidad3 = 4;

        //calcula el total de ventas de cada producto//
        int total1 = p1 * cantidad1;
        int total2 = p2 * cantidad2;
        int total3 = p3 * cantidad3;

        //calcula el total de ventas generadas//
        int totalSales = total1 + total2 + total3;

        //evalua el desempeño de las ventas//
        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
