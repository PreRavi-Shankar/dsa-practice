package Daily_logs.day_11;

public class 693_BinaryNumerWithAlternatingBits {
  class Solution {
    public boolean hasAlternatingBits(int n) {
      int r ;
      
      ArrayList<Integer> arr = new ArrayList<>();

      while(n>0){
       r= n%2;
       n= n/2;
       arr.add(r);
       
      }
      if (arr.size()==1){
        return true;
      }
      else
      {for ( int i=0; i< arr.size()-1; i++) 
      {
        if (arr.get(i)==arr.get(i+1)) {
            return false;
        }
        }
      return true;}   
    }
}
}
