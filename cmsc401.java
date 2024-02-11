// malachi williams
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner array = new Scanner(System.in);
    int sze = array.nextInt();
    int[] arr = new int[sze];
    for (int i = 0; i < sze; i++){
      arr[i] = array.nextInt();
    }
   
    int max = arr[0];
    int goal = 0;
    for (int i = 0; i < sze; i++){
      if (arr[i] > max){
        goal = max;
        max = arr[i];
      }
      
    }
    System.out.println(goal);
   
    
  }

 
}

