import java.util.Scanner;
import java.util.Arrays;

public class Siralama {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int n,sayi;
        int counter = 0;

        System.out.println("Dizinin boyutunu giriniz: ");
        n = inp.nextInt();

        int[] arr = new int[n];

        while(n > 0){
            sayi = inp.nextInt();
            if(n == 0){
                break;
            }
            else{
                arr[counter] = sayi;
            }
            counter++;
            n--;
        }

        Arrays.sort(arr);
        System.out.println("Sıralama: ");
        System.out.println("=============");

        for(int i = 0; i < arr.length;i++){
            System.out.print(" " + arr[i]) ;
        }
    }
    
}
