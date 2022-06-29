import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Fibonacci serisinin kaç hanesini istiyorsunuz? :");
             int a = input.nextInt();
             int b = 1;
             int c = 1;


       for (int i = 1;i<=a ; i++){
           int toplam= b+c;
           c=b;
           b=toplam;

           System.out.println(toplam);

       }


    }
}
