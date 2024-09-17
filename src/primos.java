import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el numero que decea saber si es par");
        int number = input.nextInt();
        if((number%2) == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
        
        input.close();
    }

}
