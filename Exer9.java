import java.util.Scanner;
public class Exer9{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("inoforme um dia da semana de 1 a 7:");
        int dia = ler.nextInt();
        if(dia >= 1 && dia <= 7){
            switch (dia){
                case 1:
                    System.out.println("domingo");
                    break;
                case 2:
                    System.out.println("segunda-feira");
                    break;
                case 3:
                    System.out.println("terça-feira");
                    break;
                case 4:
                    System.out.println("quarta-feira");
                    break;
                case 5:
                    System.out.println("quinta-feira");
                    break;
                case 6:
                    System.out.println("sexta-feira");
                    break;
                default:
                    System.out.println("sabado");
            }
        }
        else{
              System.out.println("invalido");
        }
    }
}