public class Store {
    public static void main(String[] args) {
 
        /*Se crea un array para el producto */
        int[] PrecioProductos = {13,3,5};

        /*Se crea el array cantidad de productos
         para verificar cuantos productos se venden*/

        int[] CantidadProductos = {2,3,4};

        int totalVentas=0; 

        /*Se hace el calculo para verificar la cantidad de productos vendidos */
        for(int i=0; i< PrecioProductos.length;i++){
            totalVentas += PrecioProductos[i]*CantidadProductos[i];
        }

        if (totalVentas > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}