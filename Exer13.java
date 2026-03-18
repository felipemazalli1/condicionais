import java.util.Scanner;

public class Exer13{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("escreva o número do mês de 1 a 12 : ");
        int m = ler.nextInt();

        if (m >= 1 && m <= 12){
            switch (m) {
    case 1:
        System.out.println("Verão");
        break;
    case 2:
        System.out.println("Verão");
        break;
    case 3:
        System.out.println("Outono");
        break;
    case 4:
        System.out.println("Outono");
        break;
    case 5:
        System.out.println("Outono");
        break;   
    case 6:
        System.out.println("Inverno");
        break;
    case 7:
        System.out.println("Inverno");
        break;
    case 8:
        System.out.println("Inverno");
        break;
    case 9:
        System.out.println("Primavera");
        break;
    case 10:
        System.out.println("Primavera");
        break;
    case 11:
        System.out.println("Primavera");
        break;
    default:
        System.out.println("Verão");        
}
        }
        else{
            System.out.println("Mês inválido! Escolha um entre 1 e 12. ");
        }

        
    }
}