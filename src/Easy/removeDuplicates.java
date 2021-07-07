package Easy;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = nums.length;
        int fast = 1;
        int slow = 1;
        while (fast<n){
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        System.out.println(slow);


















//        HashSet<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//
//        System.out.println(set.size());
//        int add = 1;
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i]!=nums[i+1])  add++;
//
//        }
//        System.out.println(add);
    }
}
