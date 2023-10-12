/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
         //find peak
    int length = mountainArr.length();
    int l = 1;
    int r = length - 2;

    int peak = -1;
    while(l <= r) {
        int mid = l + r >> 1;
        int c = mountainArr.get(mid);
        int le = mountainArr.get(mid - 1);
        int re = mountainArr.get(mid + 1);
        if(c > le && c > re) {
            peak = mid;
            break;
        } else if(c > le) {
            l = mid + 1;
        } else {
            //nums[mid] > nums[mid + 1]
            r = mid - 1;
        }
    }
    if(mountainArr.get(peak) == target) return peak; 

    //find left
    l = 0;
    r = peak;
    while(l <= r) {
        int mid = l + r >> 1;
        int c = mountainArr.get(mid);
        if(c == target) {
            return mid;
        } else if(c > target) {
            r = mid - 1;
        } else {
            //c < target
            l = mid + 1;
        }
    }

    //find right
    l = peak;
    r = length - 1;
    while(l <= r) {
        int mid = l + r >> 1;
        int c = mountainArr.get(mid);
        if(c == target) {
            return mid;
        } else if(c > target) {
            l = mid + 1;
        } else {
            //c < target
            r = mid - 1;
        }
    }
    return -1;
        
    }
}