import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {

        final int AGELIMIT = 18;
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age> AGELIMIT) {
            System.out.println("Access granted");
        }
        
        else if (age < AGELIMIT && age > AGELIMIT) {
            System.out.println("Access denied");
        }
        else{
            System.out.println("invalid number");
        }
        input.close();
    }
}
