public class Ortalama {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};

        System.out.println("Cevap: " + harmonic(nums));
    }

    static double harmonic(int[] nums){
        double harmonicNumber = 0;

        for(int i : nums){
            harmonicNumber += (1.0 / i);
        }
        return (nums.length/harmonicNumber);
    }
}