import java.util.Scanner;
public class Exer19{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a velocidade do veiculo: ");
        double v = ler.nextDouble();

        System.out.println("informe o limite de velocidade: ");
        double lim = ler.nextDouble();

        if(v <= lim){
             System.out.println("sem multa: ");
        } else {
            double percentual = ((v - lim) / lim) * 100;

            if(percentual <= 20){
                System.out.println("Multa leve");
            }
            else if(percentual <= 50){
                System.out.println("Multa grave");
            }
             else {
                System.out.println("Multa gravíssima + suspensão");
        }
        
    }
}
}