class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []chas = new int[26];

        for(int i=0;i<s1.length();i++){
            chas[s1.charAt(i)-'a']++;
        }

        int k = s1.length();
         int[]cha = new int[26];
        for(int i=0;i<k;i++){
            if (s1.length() > s2.length()) {
                return false;
            }
            cha[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(chas,cha)){
               return true;
        }
    
        for(int i =k;i<s2.length();i++){
            cha[s2.charAt(i-k)-'a']--;
            cha[s2.charAt(i)-'a']++;
            if (s1.length() > s2.length()) {
                return false;
            }
            if(Arrays.equals(chas,cha)){
                return true;
            }

        }

        return false;
    }
}
