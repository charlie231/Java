import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
  public static void main(String[] args) {
    FileWriter writer = null;
    try {
      writer = new FileWriter("src/OutPut01.txt");
    } catch (IOException e) {
      System.out.println("파일 생성 실패!!");
      System.exit(1);

    }

    try {
      writer.write("치킨은 살 안쪄요.");
      writer.write("외않되 왜1!!!!!");
      writer.close();
    } catch (IOException e) {
      System.out.println("파일에 데이터를 쓰는 데에 실패");
      System.exit(2);
    }
  }

}
