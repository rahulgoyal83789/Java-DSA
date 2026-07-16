package topic_15_array.L02_basic_problems_level_1;

public class Q4_is_array_sorted {
    static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        boolean isSorted = true;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted?"Array is sorted.":"Array is not sorted.");

    }
}
