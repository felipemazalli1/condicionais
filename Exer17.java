import java.util.Scanner;

public class Exer17{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor da compra : ");
        double comp = ler.nextDouble();

        double desc1 = comp * 0.20;
        double desc2 = comp * 0.10;

        double valorFinal = (comp > 500.0) ? desc1 : (comp >= 200 && comp <= 500) ? desc2 : 0.00 ;

        System.out.println("A compra no valor de : R$" +comp+ " teve um desconto de : R$" +valorFinal);

        if(valorFinal == desc1){
            double total = comp - desc1;
            System.out.println("O valor total da compra foi de : " +total);
        }
        else if(valorFinal == desc2){
            double total2 = comp - desc2;
            System.out.println("O valor total da compra foi de : " +total2);
        }
        else{
            System.out.println("O valor total foi de : " +comp);
        }

     ler.close();
    }
}