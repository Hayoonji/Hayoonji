import java.util.*;

class Solution {
    
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer>codes=new HashMap<String,Integer>();
        
        String answer = "";
        for(int i=0;i<participant.length;i++){
            if(!codes.containsKey(participant[i])){
                codes.put(participant[i],1);
            }else{
                codes.put(participant[i],codes.get(participant[i])+1);
            }
        }
        for(int i=0;i<completion.length;i++){
            if(codes.containsKey(completion[i])){    
                codes.put(completion[i],codes.get(completion[i])-1);
            }
        }
        for(String key:codes.keySet()){
            if(codes.get(key)!=0){
                answer= key ;
            }
        }
        return answer;
    }
}