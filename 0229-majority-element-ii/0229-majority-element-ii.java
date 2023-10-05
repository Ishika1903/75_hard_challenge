class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int el1 = 0;
        int el2 = 0;

        // Find the two potential majority elements
        for (int i = 0; i < n; i++) {
            if (el1 == nums[i]) {
                count1++;
            } else if (el2 == nums[i]) {
                count2++;
            } else if (count1 == 0) {
                el1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                el2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Reset counts and find the actual counts of potential majority elements
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) {
                count1++;
            } else if (nums[i] == el2) {
                count2++;
            }
        }

        // Check if the potential majority elements are actual majority elements
        if (count1 > n / 3) {
            ls.add(el1);
        }
        if (count2 > n / 3) {
            ls.add(el2);
        }

        return ls;
    }
}
