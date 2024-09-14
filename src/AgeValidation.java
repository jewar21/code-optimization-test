import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        final int AGE_LIMIT = 18;                               /*Establece el limite de edad en 18 como una constante */
        
       System.out.println();
        System.out.println("Enter your age: ");               /*Solicita al usuario ingresar su edad */
        int user_age = sc.nextInt();

        if (user_age >= AGE_LIMIT) {
            System.out.println("Access granted");
        }                                                       /*si la edad del usuario es mayor o menor mostrara un mensaje de acceso otrorgado o denegado */

        if (user_age < AGE_LIMIT) {
            System.out.println("Access denied");
        }
    }
}
