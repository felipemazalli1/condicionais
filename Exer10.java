import java.util.Scanner;
public class Exer10{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("digite um numero:");
        int num = ler.nextInt();
        
        String resultado = (num < 0) ? " negativo " : (num == 0)? "nulo" : "positivo";
        System.out.println("o numero: "+num+" é " +resultado);
    }
}