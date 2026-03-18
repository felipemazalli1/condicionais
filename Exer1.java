import java.util.Scanner;
public class Exer1{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.printf("Digite um numero:");
        num = ler.nextInt();
        System.out.printf((num%2==0) ? "Seu numero é par!" : "Seu numero é impar!");
    }
}