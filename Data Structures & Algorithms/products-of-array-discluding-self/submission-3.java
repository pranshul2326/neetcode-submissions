class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] lst = new int[n];
        pre[0]=1;
        lst[n-1]=1;
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]*nums[i-1];
            lst[n-1-i] = lst[n-i]*nums[n-i];
        }

        for(int v:pre){
            System.out.println(v);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                ans[i] = lst[i];
            }else if(i==n-1){
                ans[i] = pre[i];
            }else{
                ans[i] = pre[i]*lst[i];
            }
        }

        return ans;
    }
}  
