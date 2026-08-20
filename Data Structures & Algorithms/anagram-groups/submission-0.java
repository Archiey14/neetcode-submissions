class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);

            if(map.containsKey(s)){
                map.get(s).add(str);
            }else{
                List<String> group = new ArrayList<>();
                group.add(str);
                map.put(s,group);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> group:map.values()){
            result.add(group);
        }


        return result;
    }
}
