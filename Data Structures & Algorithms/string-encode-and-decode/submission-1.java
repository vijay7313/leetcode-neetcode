
class Solution {

        public String encode(List<String> strs) {

                StringBuilder encode = new StringBuilder();

                        String specialCharacter = "#";

                                for(String str : strs){

                                            int lengthOfStr = str.length();

                                                        encode.append(lengthOfStr).append(specialCharacter).append(str) ;
                                                                }

                                                                        return encode.toString();
                                                                            }

                                                                                public List<String> decode(String str) {

                                                                                        List<String> list = new ArrayList<>();

                                                                                                int i = 0;

                                                                                                        int lengthOfStr = str.length();

                                                                                                                //index:  0  1  2  3  4  5  6  7
                                                                                                                        //char:   3  #  a  ,  b  1  #  c

                                                                                                                                while(i < lengthOfStr){ // 0 < 8

                                                                                                                                            int hashIndex = str.indexOf("#", i); // 1

                                                                                                                                                        String lengthStr = str.substring(i, hashIndex); // 3

                                                                                                                                                                    int length = Integer.parseInt(lengthStr); //3
                                                                                                                                                                                
                                                                                                                                                                                            int start = hashIndex+1;

                                                                                                                                                                                                        list.add(str.substring(start,start + length));

                                                                                                                                                                                                                    i = start+ length;  
                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                    return list;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        }

