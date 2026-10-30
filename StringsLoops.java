public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s=s.substring(1);
        count++;
      }
      return count;
    }
  
    public String copy(String s, int num){
      String str = "";
      while(num > 0){
        str += s;
        num--;
      }
      return str;
    }
  
    public String interweaving(String s1, String s2){
      String a = "";
      for(int i = 0; i < s1.length(); i++){
        a = a + s1.substring(i,i+1) + s2.substring(i,i+1);
      }
      return a;
    }
  
  
  }