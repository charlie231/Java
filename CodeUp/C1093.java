package Codeup;

// �⼮ ��ȣ�� n�� �������� �ҷ��� ��, �� ��ȣ(1 ~ 23)�� �Ҹ� Ƚ���� ���� ����غ���.
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

