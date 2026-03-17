import java.util.Scanner;
public class Exer5{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double n1 = ler.nextDouble();
        System.out.println("Digite o segundo numero:");
        double n2 = ler.nextDouble();
        System.out.println("Digite o operador sendo 1- (+), 2- (-), 3- (*), 4- (/)  : ");
        int oper = ler.nextInt();

        double ad = n1 + n2;
        double sb = n1 - n2;
        double mt = n1 * n2;
        double div = n1 / n2;

        switch(oper){
            case 1 :
                System.out.println(ad);
                break;
            case 2 :
                System.out.println(sb);
                break;
            case 3 :
                System.out.println(mt);
                break;
            default:
                if(n2 != 0){
                    System.out.println(div);
                }
                else{
                    System.out.println("nao pode realizar divisao com 0");
                }
                break;   
        }
      
    }
}