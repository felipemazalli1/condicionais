import java.util.Scanner;
public class Exer18{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("informe um numero de 1 a 10: ");
        int n = ler.nextInt();
        
        if(n >= 1 && n <= 10){
            switch (n){
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                default:
                    System.out.println("X");
            }
        }
        else{
             System.out.println("Numero invalido");
        }
    }
}