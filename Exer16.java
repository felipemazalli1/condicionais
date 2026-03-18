import java.util.Scanner;
public class Exer16{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("escreva um numero inteiro: ");
        int n = ler.nextInt();
        
         String r =(n % 3 == 0 && n % 5 == 0) ? "É múltiplo de 3 e de 5." : (n % 3 == 0) ? "É múltiplo apenas de 3." : (n % 5 == 0) ? "É múltiplo apenas de 5." : "Não é múltiplo de 3 nem de 5.";

            System.out.println(r);
    }
}