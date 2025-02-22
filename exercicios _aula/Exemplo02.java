import java.util.Scanner;

public class Exemplo02 { 
    public static  Scanner s = new Scanner(System.in);

    public static void main(String[]args) {
       
        Double altura; 
        System.out.print("Digite sua altura ");
        altura = s.nextDouble(); 
        int peso;
        System.out.print("Digite seu peso ");
        peso = s.nextInt();
        Double imc;
        imc = peso /(altura * altura);
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc > 25) {
            System.out.println("Você está acima do peso");    
        } else {
            System.out.println("Peso normal");
        }

    



    }
}
