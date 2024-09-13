/* importamos el scanner al codigo */
import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        /* Asignamos una constante para el limite de edad */
        final int LIMIT_AGE = 18 ;
        try ( /* Declaramos la variable scanner */ Scanner scanner = new Scanner( System.in )) {
            int age ;
            /* Le preguntamos al usuario cual es su edad */
            System.out.println("What is your age?");
            /* usamos el scanner definido anteriormente para guardar el dato que digite el usuario */
            age = scanner.nextInt();
            /* nos deshacemos de la redundancia de los dos if usando un if-else */
            if (age > LIMIT_AGE ) {
                System.out.println("Access granted"); 
            } else if (age <= LIMIT_AGE & age>0) {
                System.out.println("Access denied");
            } else {
                System.out.println("Unexisting age");/* Aqui limitamos los valores para que si se llega a ingresar un valor menor a cero aparezca el mensaje de edad inexistente */
            }
        }
    }
}
