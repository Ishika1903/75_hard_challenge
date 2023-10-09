class Solution {
    public int[] searchRange(int[] nums, int target) {
 
      
        int[] arr = new int[2];
        arr[0] = firstOccurrence(nums,target); 
        arr[1] = lastOccurrence(nums,target);
        return arr; 
    }

        public static int firstOccurrence(int[] nums, int target){
         int n = nums.length; 
        int start = 0; 
        int end = n-1; 
        int first = -1; 
            while(start<=end){
                int mid = start+(end-start)/2; 
                if(nums[mid]==target){
                    first = mid; 
                   end = mid-1; 
                }
                else if (nums[mid]<target){
                    start = mid+1; 
                }
                else{
                    end = mid-1; 
                }
            }
            return first; 

        }

         public static int lastOccurrence(int[] nums, int target){
         int n = nums.length; 
        int start = 0; 
        int end = n-1; 
      int last = -1; 
            while(start<=end){
                int mid = start+(end-start)/2; 
                if(nums[mid]==target){
                    last = mid; 
                   start = mid+1; 
                }
                else if (nums[mid]<target){
                    start = mid+1; 
                }
                else{
                    end = mid-1; 
                }
            }
            return last; 

        }
        
    

        }
    
        





            

        
