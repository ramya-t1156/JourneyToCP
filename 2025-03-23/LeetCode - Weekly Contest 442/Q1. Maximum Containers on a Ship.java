class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cell = n*n;
        int cap = cell*w;
        if(cap<=maxWeight) return cell;
        
        while(maxWeight<=cap){
            cap -=w;
            cell--;
            if(cap<=maxWeight) break;
        }
        return cell;
    }
}©leetcode
