package Baek;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Beak2108 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    // 배열 생성
    int[] arr = new int[8001];

    // 평균 합, 평균
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int median = 10000;
    int mode = 10000;

    for (int i = 0; i < N; i++) {
      int value = sc.nextInt();
      sum += value;
      // 배열의 순서는 양수여야함 그래서 4000을 더해서 양수를 보장
      arr[value + 4000]++;


      if (max < value) {
        max = value;
      }

      if (min > value) {
        min = value;
      }
    }

    // 순회
    int count = 0;
    int mode_max = 0;

    // 이전의 동일한 최빈값이 1번만 등장했을경우 true, 아닐경우 false
    boolean flag = false;

    for (int i = min + 4000; i <= max + 4000; i++) {
      if (arr[i] > 0) {
        // 중앙값 찾기
        // 누적횟수가 전체 길이의 절반에 못 미친다면

        if (count < (N + 1) / 2) {
          count += arr[i];
          median = i - 4000;
        }

        // 최빈값 찾기
        if (mode_max < arr[i]) {
          mode_max = arr[i];
          mode = i - 4000;
          flag = true;
        }

        else if (mode_max == arr[i] && flag == true) {
          mode = i - 4000;
          flag = false;
        }

      }

    }

    System.out.println((int) Math.round((double) sum / N)); // 산술평균
    System.out.println(median); // 중앙값
    System.out.println(mode); // 최빈값
    System.out.println(max - min); // 범위

  }
}
