package Codeup;

// �⼮ ��ȣ�� n�� �������� �ҷ��� ��, ���� ���� ��ȣ�� ����� ����.
import java.util.Scanner;

public class C1095 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    int min = 99999;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println(min);



  }
}

