class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] s_char = new int[26];
        int[] t_char = new int[26];

        for(int i=0;i<s.length();i++){
            int ch1 = (int)(s.charAt(i) - 'a');
            int ch2 = (int)(t.charAt(i) - 'a');
            s_char[ch1]++;
            t_char[ch2]++;
        }
        
        for(int i=0;i<t_char.length;i++){
            if(s_char[i]!= t_char[i]){
                return false;
            }
        }
        return true;


    }
}
