import java.util.*;

public class Swayamvar{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int n = sc.nextInt();
    String bride = sc.next();
    String groom = sc.next();
    
    Queue<String> brideQ = new LinkedList<String>();
    Queue<String> groomQ = new LinkedList<String>();
    for(int i=0;i<bride.length();i++){
      brideQ.add(String.valueOf(bride.charAt(i)));
      groomQ.add(String.valueOf(groom.charAt(i)));
    }
     while(!groomQ.isEmpty()){
        if(groomQ.contains(brideQ.peek())){
            if(!brideQ.peek().equals(groomQ.peek())){
                String ch = groomQ.remove();
                groomQ.add(ch);
            }else{
                brideQ.remove();
                groomQ.remove();
            }
        }else
        break;//return;
    }
    if(brideQ.isEmpty())
    System.out.println("0");
    else
    System.out.println(brideQ.size());
    
    sc.close();
  }
}
