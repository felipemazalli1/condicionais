import java.util.Scanner;
public class Exer11{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("informe uma idade:");
        int id = ler.nextInt();
        
        double resultado = (id <= 12) ? 10.0 : (id > 12 && id < 60)? 20.0 : 10.0;

        System.out.println("essa pessoa de " +id+ " anos ira pagar R$ " +resultado);

    }
}