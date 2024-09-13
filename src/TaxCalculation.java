import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //se realizó la definición de constantes
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW = 0.10;
        final int TAX_THRESHOLD = 50; 
        System.out.println("ingrese la cantidad de precios que desea verificar ");

        //se crearon arrays necesarios para guardar la informacion
        int quantityprices = input.nextInt();
        double[] prices = new double[quantityprices];
        double[] tax = new double[quantityprices];

        //mendiante la utuilización de bucles se dinamizó el programa
        for (int i=0 ; i<quantityprices ; i++){
            System.out.println("ingresa el precio numero " + (i+1));
            prices[i] = input.nextDouble();
            //se realiza un condicional para compmarar los datos
            if (prices[i]<200 ){
                tax[i] = prices[i] * TAX_RATE_HIGH;

            }
            else if (prices[i]>=200){
                tax[i] = prices[i] * TAX_RATE_LOW;
            }
             
            
        }
        double totalTax = 0;
        for (int i=0; i <quantityprices; i++){
            totalTax += tax[i];
        }
        System.out.println("el impuesto total es "+totalTax);
        
        //fianlmente se indicó los resultados
        if (totalTax > TAX_THRESHOLD) {
            System.out.println(" is a High total tax: " + totalTax);
        } else {
            System.out.println("is a Low tax");
        }
    input.close();
    }
}
