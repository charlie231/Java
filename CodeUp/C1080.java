package Codeup;

// 입력된 정수와 같거나 클때가지 1부터 1씩 더한 값을 출력
import java.util.Scanner;

public class C1080 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt(); // 입력된 합
    int b = 0;
    int sum = 0;


    while (true) {
      sum += b;
      b++;

      if (sum >= a) {
        System.out.println(b - 1);
        break;
      }
    }



  }
}

