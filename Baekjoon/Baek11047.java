package Baek;

// ��������
import java.util.Scanner;
import java.util.Arrays;

public class Baek11047 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = 0;

    int N = sc.nextInt(); // ��������
    int K = sc.nextInt(); // ��
    int rest = 0;


    int[] arr = new int[N];

    for (int i = 0; i < N; i++) { // ���� �������� �Է¹ޱ�
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


