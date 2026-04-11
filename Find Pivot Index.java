class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] leftsum=new int[n];
        int[] rightsum=new int[n];

        leftsum[0]=0;
        rightsum[n-1]=0;
        
        for(int i=1;i<n;i++){
            leftsum[i]=nums[i-1]+leftsum[i-1];
        }

        for(int i=n-2;i>=0;i--){
            rightsum[i]=nums[i+1]+rightsum[i+1];
        }

        int ans=-1;
        for(int i=0;i<n;i++){
            if(leftsum[i]==rightsum[i]){
                return i;
            }
        }

        return -1;
    }
}