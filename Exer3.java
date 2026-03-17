import java.util.Scanner;
public class Exer3{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int m;
        System.out.printf("Digite a média:");
        m = ler.nextInt();
        if(m>=7){
        System.out.printf("APROVADO!");
        }
        else if(m>=5 && m<7){
            System.out.printf("RECUPERAÇÃO!");
        }
        else if(m<5){
            System.out.printf("REPROVADO!");
        }
    }
}