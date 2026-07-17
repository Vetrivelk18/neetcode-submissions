class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>map = new HashSet<>();
        int length = 0;
        int current = 0;
        int longest = 0;

        for(int n:nums){
            map.add(n);
        }
        for(int n: nums){
            if(!map.contains(n-1)){
                  current = n;
                  length=1;
                  while(map.contains(current+1)){
                    length++;
                    current++;
                  }
                
            }
           longest = Math.max(length,longest);
          
        }
        return longest;
    }
}
