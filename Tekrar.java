import java.util.Arrays;

public class Tekrar {

    public static void main(String[] args){
        int[] nums = {3,7,3,3,2,9,10,21,1,33,9,1,2,10};

        Arrays.sort(nums);

        int[] newarr = new int[2];
        int count = 0;
        

        for(int i = 0; i < nums.length-1;i++){
            if(nums[i] == nums[i+1] && nums[i+1] % 2 == 0){
                newarr[count] = nums[i];
                count++;
            }
        }

        System.out.print("Tekrar eden sayılar: " + newarr[0] + " " + newarr[1]);


    }
}
