package Baek;

// 선택정렬
import java.util.Scanner;
import java.util.Arrays;

public class Baek11047 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = 0;

    int N = sc.nextInt(); // 동전개수
    int K = sc.nextInt(); // 돈
    int rest = 0;


    int[] arr = new int[N];

    for (int i = 0; i < N; i++) { // 동전 종류마다 입력받기
      arr[i] = sc.nextInt();
    }


    for (int i = arr.length - 1; i > -1; i--) {
      if (K >= arr[i]) {
        System.out.println(arr[i]);
        rest = K / arr[i];
        K = K % arr[i];
        count += rest;
      }
    }
    System.out.println(count);

  }
}


