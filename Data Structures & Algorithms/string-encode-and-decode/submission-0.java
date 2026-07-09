class Solution {

    public String encode(List<String> strs) {

       StringBuilder ans = new StringBuilder();
        for(String s:strs){
           ans.append(s.length());
           ans.append("#");
           ans.append(s);
        }
      return ans.toString();
    }

    public List<String> decode(String str) {
        int i =0;
        int j = i;
           List<String>list = new ArrayList<>();
           while(i<str.length()){
                 while(str.charAt(j)!='#'){
                    j++;
                 }
                 String len = str.substring(i,j);
                 int trav = Integer.parseInt(len);
                 String sub = str.substring(j+1,(j+1+trav));
                 list.add(sub);
                 i=j+1+trav;
                 j=i;
                    
                 
           }
           return list;
    }
}
