class Solution {
    public int[] transformArray(int[] nums) {
        int zeroCount = 0 , oneCount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i] = 0;
                zeroCount++;
            }
            else{
                nums[i] = 1;
                oneCount++;
            }
        }
        int k = 0;
        for(int i = 0;i<zeroCount;i++){
            nums[k++] = 0;
        }
        for(int i = 0;i<oneCount;i++){
            nums[k++] = 1;
        }
        return nums;
    }
}©leetcode
