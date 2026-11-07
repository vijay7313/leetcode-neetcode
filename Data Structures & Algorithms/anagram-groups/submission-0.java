class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){

            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            String sortedStr = String.valueOf(chr);

            if(!map.containsKey(sortedStr))
                map.put(sortedStr, new ArrayList<>(List.of(str)));
            else
                map.get(sortedStr).add(str);
        }

        
        return new ArrayList<>(map.values());
    }
}
