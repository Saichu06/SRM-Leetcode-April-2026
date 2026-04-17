class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        // Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n*2;i++){
            int num=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<num){
                ans[st.pop()]=num;
            }
            if(i<n){
                st.push(i);
            }
        }
        return ans;
    }
}