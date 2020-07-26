import java.util.*;
import java.io.*;

public class GroovingMonkey{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      public static void main(String[] args) throws Exception{
       int t = Integer.parseInt(br.readLine());
        while(t--!=0)
        {
            int n = Integer.parseInt(br.readLine());
        String rr[] = br.readLine().split(" ");
          int monkey[] = new int[n+1];
          for(int i=0;i<n;i++)
            monkey[i+1] = Integer.parseInt(rr[i]);
            Set<Integer> step = new HashSet<Integer>();
            for(int j=1;j<=n;j++){
                if(monkey[j] == 0)
                continue;
                int count =0;
                int current = j;
                int block = j;
                while(true){
                 current = monkey[current];
                 monkey[block] = 0;
                 block = current;
                 count++;
                 if(current == j)
                 break;
                }
                step.add(count);
            }
            if(step.size() == 1){
                for(int x: step){
                    System.out.println(x);
                }
            }else{
                int[] st = step.stream().mapToInt(Integer::intValue).toArray(); 
                System.out.println(lcmOfElements(st));
            }
		    t--;
		}
	}
  public static int lcmOfElements(int[] element_array) 
    { 
        int lcm_of_array_elements = 1; 
        int divisor = 2; 
          
        while (true) { 
            int counter = 0; 
            boolean divisible = false; 
             for (int i = 0; i < element_array.length; i++) { 
          if (element_array[i] == 0) { 
                    return 0; 
                } 
                else if (element_array[i] < 0) { 
                    element_array[i] = element_array[i] * (-1); 
                } 
                if (element_array[i] == 1) { 
                    counter++; 
                } 
     if (element_array[i] % divisor == 0) { 
                    divisible = true; 
                    element_array[i] = element_array[i] / divisor; 
                } 
            } 
  if (divisible) { 
                lcm_of_array_elements = lcm_of_array_elements * divisor; 
            } 
            else { 
                divisor++; 
            } 
  
           if (counter == element_array.length) { 
                return lcm_of_array_elements; 
            } 
        } 
    }
}
