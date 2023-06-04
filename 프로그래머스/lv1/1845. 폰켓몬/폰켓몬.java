import java.util.HashMap;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
       int idx = 0;
        HashMap<Integer,Integer>codes=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(!codes.containsKey(nums[i])){
                codes.put(nums[i],1);
            }else{
                codes.put(nums[i],codes.get(nums[i])+1);
            }
        }
        
        int result;
        if (codes.size() > nums.length / 2) {
            result = nums.length / 2;
        } else {
            result = codes.size();
        }
        return result;

    }
    
    
}