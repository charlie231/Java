package Codeup;

import java.util.Scanner;
import java.util.Arrays;

public class C1098 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt(); // ����
    int w = sc.nextInt(); // ����
    int n = sc.nextInt(); // ���밳��
    int[][] arr = new int[h + 1][w + 1]; // �迭

    for (int i = 0; i < h; i++) { // ������ 0���� ����
      for (int j = 0; j < w; j++) {
        arr[i][j] = 0;
        // System.out.print(arr[i][j]);
      }
      // System.out.println();
    }

    for (int i = 0; i < n; i++) {
      int l = sc.nextInt(); // �������
      int d = sc.nextInt(); // ���� ����:0 ���� :1
      int x = sc.nextInt(); // ���� Ȥ�� ������ ��ġ (1�����迭)
      int y = sc.nextInt(); // ���� Ȥ�� ������ ��ġ (2�����迭)

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
