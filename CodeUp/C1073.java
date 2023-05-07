package Codeup;

// 0입력받으면 종료
import java.util.Scanner;

public class C1073 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = 1;

    while (a != 0) {
      int b = sc.nextInt();
      if (b != 0) {
        System.out.println(b);
      } else {
        a = 0;
        break;
      }

    }



  }
}

