import java.util.Scanner;
public class Exer4{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int temperatura;
        System.out.printf("Digite a temperatura em C°:");
        temperatura = ler.nextInt();
        System.out.printf((temperatura<15) ? "Frio\n" : (temperatura>=15 && temperatura<=25) ? "Agradavel\n" : "Quente\n");
    }
}