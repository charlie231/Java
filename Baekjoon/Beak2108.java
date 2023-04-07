package Baek;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Beak2108 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    // �迭 ����
    int[] arr = new int[8001];

    // ��� ��, ���
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int median = 10000;
    int mode = 10000;

    for (int i = 0; i < N; i++) {
      int value = sc.nextInt();
      sum += value;
      // �迭�� ������ ��������� �׷��� 4000�� ���ؼ� ����� ����
      arr[value + 4000]++;


      if (max < value) {
        max = value;
      }

      if (min > value) {
        min = value;
      }
    }

    // ��ȸ
    int count = 0;
    int mode_max = 0;

    // ������ ������ �ֺ��� 1���� ����������� true, �ƴҰ�� false
    boolean flag = false;

    for (int i = min + 4000; i <= max + 4000; i++) {
      if (arr[i] > 0) {
        // �߾Ӱ� ã��
        // ����Ƚ���� ��ü ������ ���ݿ� �� ��ģ�ٸ�

        if (count < (N + 1) / 2) {
          count += arr[i];
          median = i - 4000;
        }

        // �ֺ� ã��
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

    System.out.println((int) Math.round((double) sum / N)); // ������
    System.out.println(median); // �߾Ӱ�
    System.out.println(mode); // �ֺ�
    System.out.println(max - min); // ����

  }
}
