import java.util.*;

public class PetrolPump{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
  String s = sc.nextLine();
    String[] ss = s.split(" ");
   int sum=0;
    int[] S = new int[ss.length];
    for(int i=0;i<ss.length;i++){
      int x = Integer.parseInt(ss[i]);
      sum += x;
      S[i] = x;
    }
   sum += minPartition(S, S.length - 1, 0, 0);
    System.out.print(sum/2);
  }
    
	public static int minPartition(int[] S, int n, int S1, int S2)
	{
		if (n < 0) {
			return Math.abs(S1 - S2);
		}
      int inc = minPartition(S, n - 1, S1 + S[n], S2);
	//	System.out.println(inc);
		int exc = minPartition(S, n - 1, S1, S2 + S[n]);
	//	System.out.println(exc);
		return Integer.min(inc, exc);
	}
}
