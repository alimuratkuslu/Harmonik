import java.util.Scanner;

public class Random{
    public static void main(String[] args) {

        if(random() == 1){
            System.out.println("Doğru sayıyı buldunuz!");
        }
        
    }

    static int random(){

        Scanner inp = new Scanner(System.in);
        int n = 0;

        int random = (int) (Math.random() * 101);

        System.out.println("Bir sayı giriniz: ");

        while(n != random){
            n = inp.nextInt();
            if(n == random){
                return 1;
            }
            if(n > random){
                System.out.println("Küçük bir sayı giriniz: ");
            }
            else{
                System.out.println("Büyük bir sayı giriniz: ");
            }
        }
        inp.close();
        return -1;     
    }
}