class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] output = new int[2];
        for(int i= 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++ ){
                if ( j == i){
                    continue;
                }
             if ((nums[i] + nums[j]) == target ){
                output [0] = i;
                output [1] = j;
                return output;
             }   
            }
        }
        return new int [] {};
    }
}