package Codeup;

// 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때, n번째 수를 출력하는 프로그램
import java.util.Scanner;

public class C1091 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int m = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();

    long pre = 0;
    long count = a;

    for (int i = 0; i < n - 1; i++) {
      pre = (count * m) + d;
      count = pre;
    }
    System.out.println(count);



  }
}

