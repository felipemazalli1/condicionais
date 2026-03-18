import java.util.Scanner;
public class Exer8{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("informe seu peso:");
        double peso = ler.nextDouble();
        System.out.println("informe sua altura:");
        double altura = ler.nextDouble();

        double imc = peso / (altura * altura);
        String resultado = (imc < 18.5) ?"abaixo do peso" : (imc <= 25) ? "peso normal" : (imc > 25 && imc < 30) ? "acima do peso" : "peso";
        System.out.println("o seu peso é de: "+peso+ "e sua altura é de:"+altura+"voce esta:"+resultado);
    }
}