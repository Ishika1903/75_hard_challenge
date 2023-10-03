class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length; 
        int count = 0; 
        for(int i = 0; i<n; i++){
int j=i+1;
            while(j<n){
                if(nums[i]==nums[j]){
                    count++;
                }
                j++;
            }
        }
        return count; 
    }
        
    }