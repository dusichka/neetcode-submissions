class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i + 1; j < nums.length-1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        if(!result.contains(triplet)){
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result; 
    }
}
