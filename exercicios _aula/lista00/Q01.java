
import java.util.Scanner;
    public class Q01{
        public static Scanner s = new Scanner(System.in);
        public static void main (String[]args) {
        int num;
        System.out.print("Digite um número inteiro ");
        num = s.nextInt();
        if (num <=0){
            System.out.print("Min Volume");
        } else if (num >0 && num <= 25){
            System.out.println("Low Volume");
        } else if (num > 25 && num <= 75){
            System.out.println("Medium Volume");
        } else if (num > 75 && num <= 99){
            System.out.println("Higth Volume"); 
        }else{
            System.out.println("Max Volume");
        }
    


        }
    }