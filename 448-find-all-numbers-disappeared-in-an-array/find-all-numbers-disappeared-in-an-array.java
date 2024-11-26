class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> map = new HashSet<>();
        ArrayList<Integer> missList = new ArrayList<>();
        for (int num : nums){
            map.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
                if (!(map.contains(i))) {
                missList.add(i); 
            }
        }
        return missList;
    }
}