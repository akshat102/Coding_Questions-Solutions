import java.util.*;

public class DoleOutCadbury{
 static Scanner sc = new Scanner(System.in);
 static Dictionary D = new Hashtable();
  static int ll , bb;
 public static void main(String[] args)
 {
   int mL = sc.nextInt();
   int hL = sc.nextInt();
   int mW = sc.nextInt();
   int hW = sc.nextInt();
 	int res = 0;
   res = totlCount(mL,hL,mW,hW);
   System.out.print(res);
 }
static int totlCount(int m,int n, int p, int d){
 int count=0;
    for(int l=m;l<=n;l++){
      for(int  b = p;b<= d; b++){
        count += countPerChocolateBar(l,b);
      }
    }
  return count; 
}
static int countPerChocolateBar(int l,int b){
  int count = 0;
  while(true){
      int longer = l>b?l:b;
      int shorter = l<b?l:b;
      count ++;
      int diff=longer-shorter;
      if(diff==0)
        return count;
      else{
        l=l<b?l:b;
        b=diff;
      }
  }
}
}
