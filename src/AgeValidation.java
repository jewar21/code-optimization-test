import java.util.Scanner;

public class AgeValidation {
    // 1 defino constantes
    private static final int AGE_LIMIT = 18; // edad limite para el acceso

    public static void main(String[] args) {
        // 2 manejo la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // lee edad del usuario

        // 3 estructura if-else para validar la edad
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted"); // si la edad es mayor o igual al limite acceso concedido 
        } else {
            System.out.println("Access denied");  // si la edad es menor al limite acceso denegado 
        }

        // cerrar el Scanner
        scanner.close();
        
    }
}