class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        
        int[] array  = new int[26];

        for(char ch : s.toCharArray()){
            int chToNum = ch;
            array[chToNum - 97] += chToNum;
        }

         for(char ch : t.toCharArray()){
            int chToNum = ch;
            array[chToNum - 97] -= chToNum;
        }

        for(int check : array)
            if(check != 0)
                return false;

        return true;
    }
}
