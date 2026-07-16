package topic_15_array.L02_basic_problems_level_1;

public class Second_smallest_element {
    static void main(String[] args) {
        int[] nums = new int[]{10,2,2,5,2,37,8,36};
        int smallest = Math.min(nums[0],nums[1]);
        int secondSmallest = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++){
            if(nums[i] < smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            } else if(nums[i] < secondSmallest && nums[i]!=smallest) secondSmallest = nums[i];
        }
        System.out.println("The smallest element is " + smallest);
        System.out.println("The second smallest element is " + secondSmallest);
    }
}
