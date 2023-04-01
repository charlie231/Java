package Baek;

import java.util.Scanner;
import java.util.LinkedList;

public class Baek1966 {
  public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int T = in.nextInt(); // �׽�Ʈ ���̽�

    while (T-- > 0) {

      int N = in.nextInt();
      int M = in.nextInt();

      LinkedList<int[]> q = new LinkedList<>(); // Queue�� Ȱ�� �� ���Ḯ��Ʈ

      for (int i = 0; i < N; i++) {
        // {�ʱ� ��ġ, �߿䵵}
        q.offer(new int[] {i, in.nextInt()});
      }

      int count = 0;

      while (!q.isEmpty()) { // �� ���̽��� ���� �ݺ���

        int[] front = q.poll(); // ���� ù ����
        boolean isMax = true; // front ���Ұ� ���� ū ���������� �Ǵ��ϴ� ����

        // ť�� �����ִ� ���ҵ�� �߿䵵�� ��
        for (int i = 0; i < q.size(); i++) {

          // ó�� ���� ���Һ��� ť�� �ִ� i��° ���Ұ� �߿䵵�� Ŭ ���
          if (front[1] < q.get(i)[1]) {

            // ���� ���� �� i ������ ���ҵ��� �ڷ� ������.
            q.offer(front);
            for (int j = 0; j < i; j++) {
              q.offer(q.poll());
            }

            // front���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� false�� �ϰ� Ž���� ��ħ
            isMax = false;
            break;
          }
        }

        // front ���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� ���� �ݺ������� �Ѿ
        if (isMax == false) {
          continue;
        }

        // front ���Ұ� ���� ū ���ҿ����Ƿ� �ش� ���Ҵ� ����ؾ��ϴ� ������.
        count++;
        if (front[0] == M) { // ã���� �ϴ� ������� �ش� �׽�Ʈ���̽� ����
          break;
        }

      }

      sb.append(count).append('\n');

    }
    System.out.println(sb);
  }


}


