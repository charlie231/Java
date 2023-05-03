package Baek;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Baek2805 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt(); // N= ������ ��
    int M = sc.nextInt(); // M = �߶���� �ּ����� ��������
    int[] tree = new int[N]; // ���� ����

    int min = 0;
    int max = 0;


    for (int i = 0; i < N; i++) {
      tree[i] = sc.nextInt(); // �Է¹ޱ�

      if (max < tree[i]) {
        max = tree[i];
      }
    }

    // �̺�Ž�� (upper bound)
    while (min < max) {

      int mid = (min + max) / 2;
      long sum = 0;
      for (int treeHieght : tree) {
        if (treeHieght - mid > 0) {
          sum += treeHieght - mid;
        }
      }



      // �ڸ��� ���� �������
      if (sum < M) {
        max = mid;
      }

      // �ڸ��� ���� �÷�����
      else {
        min = mid + 1;
      }



      // }
    }
    System.out.println(min - 1);

  }
}
