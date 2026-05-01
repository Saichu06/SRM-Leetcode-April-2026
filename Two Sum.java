class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int idx1=-1;
        int idx2=-1;
        for(int i=0;i<nums.length;i++){
            int currVal = target - nums[i];
            if(map.containsKey(currVal)){
                idx1=map.get(currVal);
                idx2=i;
            }
            map.put(nums[i],i);
        }
        return new int[]{idx1,idx2};
    }
}