class Solution {
    int[] leftprefix;
    int[] rightprefix;
    
    public int pivotIndex(int[] nums) {
        leftprefix = new int[nums.length];
        leftprefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            leftprefix[i] = nums[i] + leftprefix[i-1];
        }
        rightprefix = new int[nums.length];
        rightprefix[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){
            rightprefix[i] = nums[i] + rightprefix[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            if(leftprefix[i]==rightprefix[i]){
                return i;
            }
        }
        return -1;
    }
}