class Solution {
    public int minOperations(int[] nums) {
        int output = Integer.MAX_VALUE, j = 1;
        Arrays.sort(nums);
        HashSet<Integer> info = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i], b = nums[i] + nums.length -1;
            info.add(a);
            while(j<nums.length && nums[j]<=b) info.add(nums[j++]);
            output = Math.min(output,nums.length - info.size());
            info.remove(a);
        }
        return output;
    }
}