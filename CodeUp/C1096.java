package Codeup;


// �ٵ���(19 * 19)�� n���� �� ���� ���´ٰ� �� ��,
// n���� �� ���� ���� ��ġ�� ����ϴ� ���α׷�
import java.util.Scanner;

public class C1096 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] arr = new int[19][19];

    int a = sc.nextInt();

    for (int x = 0; x < a; x++) {
      int b = sc.nextInt();
      int c = sc.nextInt();

      arr[b - 1][c - 1] = 1;
    }

    for (int i = 0; i < 19; i++) {
      for (int j = 0; j < 19; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }



}

