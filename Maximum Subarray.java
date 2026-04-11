class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int num:nums){
            currsum+=num;
            maxsum=Math.max(maxsum,currsum);
            currsum=Math.max(currsum,0);
        }
        return maxsum;
    }
}