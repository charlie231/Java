package Codeup;

import java.util.Scanner;
import java.util.Arrays;

public class C1098 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt(); // 세로
    int w = sc.nextInt(); // 가로
    int n = sc.nextInt(); // 막대개수
    int[][] arr = new int[h + 1][w + 1]; // 배열

    for (int i = 0; i < h; i++) { // 격자판 0으로 세팅
      for (int j = 0; j < w; j++) {
        arr[i][j] = 0;
        // System.out.print(arr[i][j]);
      }
      // System.out.println();
    }

    for (int i = 0; i < n; i++) {
      int l = sc.nextInt(); // 막대길이
      int d = sc.nextInt(); // 방향 가로:0 세로 :1
      int x = sc.nextInt(); // 왼쪽 혹은 위쪽의 위치 (1차원배열)
      int y = sc.nextInt(); // 왼쪽 혹은 위쪽의 위치 (2차원배열)

      if (d == 0) {
        for (int j = 0; j < l; j++) {
          arr[x][y + j] = 1;
        }
      }

      else {
        for (int j = 0; j < l; j++) {
          arr[x + j][y] = 1;
        }
      }
    }
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }
}
