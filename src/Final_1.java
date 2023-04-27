import java.util.Arrays;

public class Final_1{
    
    public static int removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        
        Arrays.sort(nums);
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
    
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 4, 6, 6, 6};
        int newLength = removeDuplicates(nums);
        
        System.out.print("Modified Array: ");
        for(int i = 0; i < newLength - 1; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[newLength]);
    }
}
