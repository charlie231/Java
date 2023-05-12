package Codeup;

// 출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.
import java.util.Scanner;

public class C1095 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    int min = 99999;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println(min);



  }
}

