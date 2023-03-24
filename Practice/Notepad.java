import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Notepad {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("���ϴ� �۾� ��ȣ �Է�");
      System.out.println("1. �޸��б�");
      System.out.println("2. �� �޸�");
      System.out.println("3. ����");

      int taskNum;

      try {
        String input = sc.nextLine();
        taskNum = Integer.parseInt(input);
        // sc int�� �ٲٱ�
      } catch (NumberFormatException e) {
        System.out.println("�߸��� �Է�");
        continue;
      }
      if (taskNum == 1) {
        System.out.println("�޸� ���ϸ��� �Է�");

        String fileName = sc.nextLine();
        FileInputStream inputStream = null;

        try {
          inputStream = new FileInputStream(fileName);

        } catch (FileNotFoundException e) {
          System.out.println("���� ���� ����");
          continue;
        }
        System.out.println(fileName + "�� ������ ���");
        Scanner reader = new Scanner(inputStream);

        while (reader.hasNextLine()) {
          System.out.println(reader.nextLine());
        }
        System.out.println("\n");

        reader.close();
      }

      else if (taskNum == 2) {
        System.out.println("������ �޸� ���ϸ��� �Է��ض�");
        String fileName = sc.nextLine();
        FileWriter writer = null;


        try {
          writer = new FileWriter(fileName);

        } catch (IOException e) {
          System.out.println("���� ���� ����");
          continue;
        }
        System.out.println("�޸��� ���ڿ��� �Է�");
        System.out.println("����: ���ٿ��� ���� �Է�");

        while (true) {
          String input = sc.nextLine();
          if (input.equals("")) {
            break;
          }

          try {
            writer.write(input);
            writer.write("\n");
          } catch (IOException e) {
            System.out.println("���Ͽ� ���ڿ��� ����");
          }
        }

        try {
          writer.close();
        } catch (IOException e) {
          System.out.println("������ �ݴµ� ����");
        }

      }

      else if (taskNum == 3) {
        System.out.println("���α׷� ����");
        break;

      }

      else {
        System.out.println("�߸��� �Է��̿� ����");
      }

    }

  }

}
