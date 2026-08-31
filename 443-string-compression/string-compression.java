class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i=0,j=0;
        int index =0;
        while(j<n){
            if(chars[i] == chars[j]) j++;
            else{
                int freq = j-i;
                chars[index++] =chars[i];
                if(freq > 1){
                    String count = String.valueOf(freq);
                    for(char c : count.toCharArray()){

                        chars[index++] = c;
                    }
                }
                i=j;
            }
        }
        int freq = j-i;
        chars[index++] =chars[i];
        if(freq > 1){
            String count = String.valueOf(freq);
            for(char c : count.toCharArray()){
                chars[index++] = c;
            }
        }
        return index;
    }
}