import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
  public static void main(String[] args) {
    FileWriter writer = null;
    try {
      writer = new FileWriter("src/OutPut01.txt");
    } catch (IOException e) {
      System.out.println("���� ���� ����!!");
      System.exit(1);

    }

    try {
      writer.write("ġŲ�� �� ���ǿ�.");
      writer.write("�ܾʵ� ��1!!!!!");
      writer.close();
    } catch (IOException e) {
      System.out.println("���Ͽ� �����͸� ���� ���� ����");
      System.exit(2);
    }
  }

}
