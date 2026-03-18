import java.util.Scanner;
public class Exer15{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("escreva o seu nome de usuario:");
        String user = ler.nextLine();

        System.out.println("informe a senha numerica:");
        int senha = ler.nextInt();
        
        String a = "felipe";

        String login = 
            (a.equals(user) && senha == 12345) ? "acesso liberado" : "acesso negado";
            System.out.println(login);
    }
}