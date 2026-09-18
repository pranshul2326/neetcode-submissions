class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int v:nums){
            if(set.contains(v)){
                return true;
            }else{
                set.add(v);
            }
        }
        return false;
        
    }
}