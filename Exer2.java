import java.util.Scanner;
public class Exer2{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int num, num2;
        System.out.printf("Digite o primeiro numero:");
        num = ler.nextInt();
        System.out.printf("Digite o segundo numero:");
        num2 = ler.nextInt();
        System.out.printf((num>num2) ? "O numero "+num+" é maior que "+num2 : "O numero "+num2+" é maior que "+num+"\n");
    }
}