public class NumbersLoops{
    public NumbersLoops(){
      int i = 0;
      while(i<11){
        System.out.println(i);
        i++;
      }
    }
  
    public int digitSum(int num){
      int i = 1;
      int j = 0;
      while (i <= num) {
        j+=i;
        i++;
      }
      return j;
    }
    
    
    public int reverseNum(int num){
      int j = 0;
      while(num > 0){
        j = j * 10 + num % 10;
        num = num / 10;
      }
      return j;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int dih = 0;
      while(start<=finish){
        if (start == reverseNum(start)) {
          dih++;
        }
        start++;
      }
      return dih;
    }
  
  
  }
