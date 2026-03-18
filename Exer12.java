import java.util.Scanner;
public class Exer12{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("escreva a nota:");
        double n = ler.nextInt();
        
       String resultado = (n >= 9) ? "(a)" : (n >= 7) ? "(b)" : (n >= 5) ? "(c)" : "(d )";
       System.out.println("A nota do aluno foi de : " +n+ " fazendo-o receber : " +resultado);
    }
}