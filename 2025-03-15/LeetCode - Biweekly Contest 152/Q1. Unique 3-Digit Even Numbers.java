class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        int n = digits.length;
        for(int i = 0;i<n;i++){
            // there should not be any leading zeros
            if(digits[i]==0) continue;
            for(int j = 0;j<n;j++){
                if(i==j) continue;
                for(int k = 0;k<n;k++){
                    if(i==k || j==k) continue;
                    if(digits[k]%2!=0) continue;

                    int temp = digits[i]*100 + digits[j]*10 + digits[k];
                    uniqueNumbers.add(temp);
                }
            }
        }
        return uniqueNumbers.size();
    }
}©leetcode
