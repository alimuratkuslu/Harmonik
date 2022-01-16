import java.util.Arrays;

public class Tekrar1 {
    public static void main(String[] args) {
        
        int[] nums = {10,20,20,10,10,20,5,20};

        Arrays.sort(nums);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;


        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 10){
                count1++;
            }
        }
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 20){
                count2++;
            }
        }
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 5){
                count3++;
            }
        }
        System.out.println("10 sayısı " + count1 + " kere tekrar edildi!");
        System.out.println("20 sayısı " + count2 + " kere tekrar edildi!");
        System.out.println("5 sayısı " + count3 + " kere tekrar edildi!");
    }
    
}
