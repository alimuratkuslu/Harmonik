import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int sayi;

        System.out.println("Bir sayı giriniz: ");
        sayi = inp.nextInt();

        int[] nums = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];

        for(int i = 0; i < nums.length;i++){
            if(nums[i] < sayi){
                min = nums[i];
            }
        }

        for(int i = nums.length - 1; i > 0;i--){
            if(nums[i] > sayi){
                max = nums[i];
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: "+ min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+ max);

    }
}
