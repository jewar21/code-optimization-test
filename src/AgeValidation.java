import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        final int AGELIMITD = 18;
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age> AGELIMITD) {
            System.out.println("Access granted");
        }
        
        else if (age < AGELIMITD && age > AGELIMITD) {
            System.out.println("Access denied");
        }
        else{
            System.out.println("invalid number");
        }
        input.close();
    }
}
