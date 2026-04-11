class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currsum=0;
        for(int i=0;i<k;i++){
            currsum+=nums[i];
        }
        int max=currsum;
        for(int i=k;i<nums.length;i++){
            currsum-=nums[i-k];
            currsum+=nums[i];
            max=Math.max(max,currsum);
        }
        return (double)max/k;
    }
}