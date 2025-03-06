import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        //importe un scanner
        Scanner input = new Scanner(System.in);
        //pido cuantos usuarios van a usar el programa
        System.out.println("ingrese la cantidad de usuarios que van a usar el programa");
        int numberUsers = input.nextInt();
        //hago arreglos paraalmacenar los precios y el total
        int[] price = {15 , 10 , 5};
        int[] total = new int[numberUsers];
        //para que repita segun la cantidad de usuarios
        for(int i=0; i<numberUsers; i++){
            //declaro una bandera y un subtotal
            int flag = 0, subTotal = 0;
            //digo que usuario es
            System.out.println("usuario "+ (i+1));
            while (flag ==0) {
                //pido al usuario lo que decea almacenar 
            System.out.println("que decea agregar");
            System.out.println("  codigo precio");
            System.out.println("   1          15");
            System.out.println("   2          10");
            System.out.println("   3           5");
            //dependiendo el codigo almacena la info
            int code = input.nextInt();
                switch (code) {
                    case 1:
                        System.out.println("cuantas unidades va a almacenar");
                        int unity = input.nextInt();
                        subTotal += unity*price[(code-1)];
                        break;
                    case 2:
                    System.out.println("cuantas unidades va a almacenar");
                        unity = input.nextInt();
                        subTotal += unity*price[(code-1)];
                    break;
                        
                    case 3:
                        System.out.println("cuantas unidades va a almacenar");
                        unity = input.nextInt();
                    subTotal += unity*price[(code-1)];
                    break;
                        
                //si da un codigo mayor o menor a esos no lo deja continuar
                    default:
                    System.out.println("codigo no valido");
                        break;
                    
                }
                //le dice si quiere continuar o salir del usuario
                System.out.println("si decea agregar otro articulo escriba 0");
                System.out.println("si no escriba otro numero");
                flag = input.nextInt();
            }
            //almacena la informacion de cada usuario
            total[i]=subTotal;
            
            

        }
        int totalSales = 0;
        //suma todos los usuarios
        for(int i = 0; i<numberUsers; i++){
            totalSales+=total[i];
            
        }
        //le dice si cumplio el requerimiento o no
        System.out.println("su total del dia es: "+totalSales);
        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
        input.close();
    }
}
