import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {

        //Definición de constantes
        final int LEGAL_AGE = 18;
        final int AGE_LIMIT = 0;

        //Inicialización del escaner para pedir datos al ususario
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Type your age");
            int age = scan.nextInt();
            
            //Validación de la edad
            if (age < AGE_LIMIT) {
                System.out.println("Invalid Age");
            }
            //Comprobar el caso correspondiente y salida de texto
            else if (age >= LEGAL_AGE) {
            System.out.println("Access granted");
            }
            else {
            System.out.println("Access denied");
            }
        }
    }
}
