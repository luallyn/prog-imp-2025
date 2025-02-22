import java.util.Scanner;

public class Exemplo01 {
     public static  Scanner s = new Scanner(System.in);

    public static void main (String[]args) {


         int num;
         System.out.print("digite um numero inteiro");
         num = s.nextInt();
         System.out.println("você digitou o número " + num);
             if (num < 0) {
            System.out.println("o número " + num + " é negativo");
         }  else if (num == 0) {
                System.out.println("o número " + num + " é neutro");
         }  else {
            System.out.println("o número " + num + " é positivo");
         }

         }


    }