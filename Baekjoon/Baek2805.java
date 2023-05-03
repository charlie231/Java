package Baek;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Baek2805 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt(); // N= 나무의 수
    int M = sc.nextInt(); // M = 잘라야할 최소한의 나무길이
    int[] tree = new int[N]; // 나무 길이

    int min = 0;
    int max = 0;


    for (int i = 0; i < N; i++) {
      tree[i] = sc.nextInt(); // 입력받기

      if (max < tree[i]) {
        max = tree[i];
      }
    }

    // 이분탐색 (upper bound)
    while (min < max) {

      int mid = (min + max) / 2;
      long sum = 0;
      for (int treeHieght : tree) {
        if (treeHieght - mid > 0) {
          sum += treeHieght - mid;
        }
      }



      // 자르는 길이 낮춰야함
      if (sum < M) {
        max = mid;
      }

      // 자르는 길이 올려야함
      else {
        min = mid + 1;
      }



      // }
    }
    System.out.println(min - 1);

  }
}
