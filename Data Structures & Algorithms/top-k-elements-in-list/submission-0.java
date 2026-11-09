class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        
        list.sort((a,b)-> b-a);
        
        int threshold = list.get(k-1);

        int[] array = new int[k];

        int index = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>= threshold)
                array[index++] = entry.getKey();
        }

    return array;
    }
}
