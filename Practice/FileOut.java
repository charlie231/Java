
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOut {
  public static void main(String[] args) {
    FileWriter writer = null;
    try {
      writer = new FileWriter("Practice/src/OutPutt.txt", true);
      System.out.println("�����1");
    } catch (IOException e) {
      System.out.println("���� ���� ����!!");
      System.exit(1);


    }

    Scanner sc = new Scanner(System.in);
    System.out.println("�����Ϸ��� �Է� ���� ����");
    while (true) {


      String input = sc.nextLine();
      if (input.equals("")) {
        System.out.println("���� �Է� ����");
        break;

      }

      try {
        writer.write(input);
        writer.close();
      } catch (IOException e) {
        System.out.println("���Ͽ� �����͸� ���� ���� ����");
        System.exit(2);
      }
    }
    try {
      writer.close();
    } catch (IOException e) {
      System.out.println("���� �ݱ⿡ ����.");
    }

  }

}
