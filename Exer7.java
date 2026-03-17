import java.util.Scanner;
public class Exer7{
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        System.out.println("escreva o rpimeiro lado do triangulo:");
        double lado1 = ler.nextDouble();
        System.out.println("escreva o segundo lado do triangulo");
        double lado2 = ler.nextDouble();
        System.out.println("escreva o terceiro lado do triangulo");
        double lado3 = ler.nextDouble();
        
        if  (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("triangulo: equilatero ");
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("triangulo: isoceles");
            }
            else{
                System.out.println("triangulo: escaleno");
            }
        } else {
             System.out.println("invalido");
        }
    }
}