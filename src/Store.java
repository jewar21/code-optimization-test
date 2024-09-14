import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        //Definición de constantes
        final int SALES_TRESHOLD = 100;
        final int MAX_PRODUCTS = 3;

        //Definición de los arrelos con precios y cantitades
        int[] prices = {15, 10, 5};
        int[] quantities = new int[3];

        //Se pide la cantidad de cada producto y se almacena en una matriz
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < MAX_PRODUCTS; i++) {
                System.out.printf("Ingresa la cantidad del producto %s con valor de: $%s%n", i+1, prices[i]);
                quantities[i] = scan.nextInt();
            }
            //Inicialización del contador con el total de ventas
            int totalSales = 0;

            //Ciclo para realizar las operaciones entre arreglos
            for (int i = 0; i < MAX_PRODUCTS; i++) {
            totalSales += prices[i] * quantities[i];
            }

            System.out.println("\nEl total de las ventas fué de: $" + totalSales);
            //Verificación y salida de texto
            if (totalSales >= SALES_TRESHOLD) {
            System.out.println("Buen desempeño de ventas");
            } 
            else {
            System.out.println("Mal desempeño de ventas");
            }
        }
       
    }
}