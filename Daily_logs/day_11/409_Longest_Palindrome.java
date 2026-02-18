class Solution {
    public int longestPalindrome(String s) {
      char[] c= s.toCharArray();
      Arrays.sort(c);
      int count=0;
      for(int i=0; i<c.length-1; i++){
      if (c[i]==c[i+1]){
        count+=2;
        i++;
      }else continue;
      } 
     return count < s.length() ? count + 1 : count;
    }
}