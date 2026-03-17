import java.util.Scanner;
public class Exer6{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o ano:");
        int ano = ler.nextInt();
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("seu ano é bissexto");
        }
        else{
              System.out.println("seu ano não é bissexto");
        }
    }
}