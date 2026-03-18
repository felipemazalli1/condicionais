import java.util.Scanner;
public class Exer20{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("1 - pedra: ");
        System.out.println("2 - papel: ");
        System.out.println("3 - tesoura: ");
        

        System.out.println("jogador 1 : ");
        int j1 = ler.nextInt();

        System.out.println("jogador 2 : ");
        int j2 = ler.nextInt();

        if(j1 < 1 || j1 > 3 || j2 < 1 || j2 > 3) {
         System.out.println("opção invalida"); 
    }
    else{

        String res;
        if(j1 == j2){
            res = "empate";
        }
         else if ((j1 == 1 && j2 == 3) || (j1 == 3 && j2 == 2) || (j1 == 2 && j2 == 1)
            ) {
        res = " jogador 1 venceu";
        }
        else{
            res = "jogador 2 venceu";
        }
         System.out.println(res);
    }
}
}