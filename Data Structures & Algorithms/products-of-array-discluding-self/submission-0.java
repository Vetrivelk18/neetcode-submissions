class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right =1;
        int[] ans = new int[nums.length];
        //int n = new int[nums.length-1];

        for(int i=0;i<nums.length;i++){
            
                ans[i] = left;
                left = left*nums[i];
        }

        for(int i= nums.length-1;i>=0;i--){
            ans[i] = ans[i]*right;
            right = right*nums[i];
        }

        return ans;
    }
}  
