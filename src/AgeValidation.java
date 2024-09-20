import java.util.Scanner; // importamos el scanner
public class AgeValidation {
    public static void main(String[] args) {
        
        // creamos una instancia que permite leer datos escritos por teclado
        Scanner scanner = new Scanner(System.in); 

        // creamos un mensaje para ingresar la edad
        System.out.print("ingrese su edad");
        
         // se lee el numero entero ingresado por el usuario y lo guardamos en userAge
        int userAge = scanner.nextInt();
        
        // establecemos 18 como una constante entera de nombre AGE_LIMIT
        final int AGE_LIMIT = 18; 

        // creamos la condicion 
        if (userAge >= AGE_LIMIT ){

            // si se cumple se le permitira el acceso al usuario
            System.out.println("Acesso permitido"); 
        }
        else{
            
            // si no se cumple se le denegara el acceso a este
            System.out.println("Acceso denegado"); 
        }

        scanner.close();
    }
}
