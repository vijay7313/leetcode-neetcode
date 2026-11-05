class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        
        Map<Character, Integer> map = new HashMap<>();

        for(Character ch : s.toCharArray())
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        
        for(Character ch : t.toCharArray())
            if(!map.containsKey(ch))
                return false;
            else{
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0)
                    map.remove(ch);
            }
        
        return map.size() == 0;
    }
}
