import java.util.Scanner;

public class decisiones {
    public static void main(String[] args) {
        Scanner decide = new Scanner(System.in);
        System.out.println("elije un numero entre uno y dos");
        int number = decide.nextInt();
        if (number<1 || number>2){
            System.out.println("recuerde ingresar un numero valido");
        }
        else if(number==1) {
            System.out.println("Cevaztiam barre");
        } else  {
            System.out.println("Cevanstiam Duerme");
        }
        decide.close();

    }
}
