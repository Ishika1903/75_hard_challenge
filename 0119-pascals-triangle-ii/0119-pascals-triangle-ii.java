class Solution {
    public List<Integer> getRow(int rowIndex) {
              long ans = 1; 
        List<Integer> arr = new ArrayList<>(); 
       
        for(int col=0; col<=rowIndex; col++){
             arr.add((int)ans);
            ans = ans *(rowIndex-col);
            ans = ans/(col+1); 
        }
        return arr;
        
    }
}