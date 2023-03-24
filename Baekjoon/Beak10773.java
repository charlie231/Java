import java.util.Scanner;
import java.util.Stack;

public class Beak10773 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();



    for (int i = 0; i < K; i++) {
      int number = sc.nextInt();
      if (number == 0) {
        stack.pop();
      } else {
        stack.push(number);
      }
    }

    int sum = 0;
    for (int o : stack) {

      sum += o;

    }
    System.out.println(sum);



  }



}
