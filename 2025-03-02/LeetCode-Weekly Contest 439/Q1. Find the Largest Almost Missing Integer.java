class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        
        for(int i = 0;i<=n-k;i++){
            HashSet<Integer> uniqueNums = new HashSet<>();
            for(int j = i;j<i+k;j++){
                uniqueNums.add(nums[j]);
            }
            for(int val : uniqueNums){
                hm.put(val,hm.getOrDefault(val,0)+1);
            }
        }

        int maxMissingInteger = -1;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()==1){
                maxMissingInteger = Math.max(maxMissingInteger,entry.getKey()); 
            }
        }
        return maxMissingInteger;
    }
}
