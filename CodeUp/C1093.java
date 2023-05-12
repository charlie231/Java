package Codeup;

// 출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class C1093 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int n = sc.nextInt();
    int[] arr = new int[23];

    for (int i = 0; i < n; i++) {
      arr[sc.nextInt() - 1]++;
    }

    for (int x : arr) {
      System.out.println(x);
    }



  }
}

