class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
                        int[] ans = new int[2];
        for(int i =0; i<nums.length;i++){
            int val = nums[i];
            if(map.containsKey(val)){
                
                ans[0]=map.get(val);
                ans[1]=i;
                break;
            }else{
                map.put(target-val,i);
            }
        }
        return ans;
        
    }
}
