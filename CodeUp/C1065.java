package Codeup;

// 짝수만 출력
import java.util.Scanner;

public class C1065 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    for (int i = 0; i < 3; i++) {
      int a = sc.nextInt();
      if (a % 2 == 0) {
        System.out.println(a);
      } else {
        continue;
      }
    }



  }
}

