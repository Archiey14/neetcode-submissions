class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int newVal = map.get(s.charAt(i))+1;
                map.put(s.charAt(i),newVal);
            }
            else{map.put(s.charAt(i),1);}
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int newVal = map.get(t.charAt(i))-1;
                map.put(t.charAt(i),newVal);
            }
            else{return false;}
            
        }

        for(int value:map.values()){
            if(value!=0)return false;
        }

        return true;



    }
}
