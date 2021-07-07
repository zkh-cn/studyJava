package Easy;
import java.util.Arrays;
public class maxSubArray {
    public static void main(String[] args) {
        maxSubArray maxSubArray = new maxSubArray();
        int[] nums = {1,2,-1,-2,2,1,-2,1,4,-5,4};
        System.out.println(maxSubArray.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        //很明显，双指针
        int len = nums.length;
        if(len==1)  return nums[len-1];
        int first = 0;
        int second = len - 1;
        int sum = 0;
        int k = 0;
        int[] arr = new int[len];
        while(first<=second){
            for(int i=first;i<=second;i++){
                sum+= nums[i];
            }
            arr[k] = sum;
            if(nums[first]<nums[second]){
                first++;
            }else{
                second--;
            }
            k++;
            sum = 0;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
