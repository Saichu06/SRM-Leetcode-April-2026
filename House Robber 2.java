class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
         if (n == 1) return nums[0];
        int[] firstinclude=new int[n-1];
        int[] firstexclude=new int[n-1];
        //2 Cases : Include first and Exclude first
        for(int i=0;i<n-1;i++){
            firstinclude[i]=nums[i];
            firstexclude[i]=nums[i+1];
        }

        int firstinc=robHelper(firstinclude);
        int firstexc=robHelper(firstexclude);

        int ans=Math.max(firstinc,firstexc);

        return ans;
    }

    public int robHelper(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        if (n == 1) return arr[0];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[1],arr[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }

        return dp[n-1];
    }
}