class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int []cha = new int [26];
        int maxfreq = 0;
        int maxlength = 0;
        for(int right=0; right<s.length();right++){
            cha[s.charAt(right)-'A']++;

            maxfreq = Math.max(maxfreq,cha[s.charAt(right)-'A']);
            int windowsize = ((right-left+1));
            while((right-left+1)-maxfreq>k){
                cha[s.charAt(left)-'A']--;
                left++;
            }

            maxlength = Math.max(maxlength, (right-left+1));
        }
     return maxlength;
      
    }
}
