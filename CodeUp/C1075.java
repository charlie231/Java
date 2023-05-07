package Codeup;

// 숫자가 0이될떄까지 1씩줄어들며 출력
import java.util.Scanner;

public class C1075 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    for (int i = a; i > 0; i--) {
      a--;
      System.out.println(a);


    }



  }
}

