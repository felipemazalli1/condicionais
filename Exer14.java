import java.util.Scanner;
public class Exer14{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("innforme o primeiro numero:");
        int n1 = ler.nextInt();
        System.out.println("innforme o segundo numero:");
        int n2 = ler.nextInt();
        System.out.println("innforme o terceiro numero:");
        int n3 = ler.nextInt();

        int maior = n1;

        if(n2 > maior){
            maior = n2;
        }
        if(n3 > maior){
            maior = n3;
        }
        if((n1 == n2 && n2 == maior) || (n1 == maior && n3 == maior) || (n2 == maior && n3 == maior)) {
            if (n1 == n2 && n2 == n3){
                System.out.println("os tres numeros sao iguais");
            } else{
                 System.out.println("empate no maior valor: " + maior);
            }
        } else{
            System.out.println("o maoir numero é:" +maior);
        }
    }
}