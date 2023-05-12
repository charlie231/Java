package Codeup;

// 입력받은 수 까지의 합 출력
import java.util.Scanner;

public class C1087 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= a; i++) {
      sum += i;
      if (sum >= a) {
        break;
      }
    }
    System.out.println(sum);



  }
}

