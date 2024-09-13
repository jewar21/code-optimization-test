public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //pedir al usuario que ingrese su edad//
        System.out.println (" ingrese su edad: ");
       
        int age = scanner.nextInt();
        
        //validar si la edad es mayor o igual a 18//
        if (age >= 18) {
            System.out.println("Access granted");
        }else {
            System.out.println("Access denied");
        }
    }
}
