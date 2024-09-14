public class Store {
    public static void main(String[] args) {

        // se define como constantes los precios y las cantidades de productos a la vez que se almacenan en arrays
       final int[] precioProducto = {15, 10, 5};

       final int[] cantidadesVendidas = {2, 3, 4};

       final int umbralDeVentas = 50; // se almacena  en una constante el umbral de ventas

       int ventasTotales = 0; // se define ventas totales como un contador que se va incrementando teniendo en cuenta los precios y las cantidades

       // se utiliza un bucle para calcular el numero de ventas totales
       for (int i=0; i < precioProducto.length; i++){
        ventasTotales += precioProducto[i] * cantidadesVendidas[i];
       }

       System.out.println(ventasTotales);
        
       // se compara el numero de ventas totales con el umbral de ventas para verificar si hubo un buen desempeño de ventas
        if (ventasTotales > umbralDeVentas ) {
            System.out.println("Buen desempeño de ventas");
        } else {
            System.out.println("Bajo desempeño de ventas");
        }
    }
}
