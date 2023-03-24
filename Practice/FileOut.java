
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOut {
  public static void main(String[] args) {
    FileWriter writer = null;
    try {
      writer = new FileWriter("Practice/src/OutPutt.txt", true);
      System.out.println("실험용1");
    } catch (IOException e) {
      System.out.println("파일 생성 실패!!");
      System.exit(1);


    }

    Scanner sc = new Scanner(System.in);
    System.out.println("종료하려면 입력 없이 엔터");
    while (true) {


      String input = sc.nextLine();
      if (input.equals("")) {
        System.out.println("파일 입력 종료");
        break;

      }

      try {
        writer.write(input);
        writer.close();
      } catch (IOException e) {
        System.out.println("파일에 데이터를 쓰는 데에 실패");
        System.exit(2);
      }
    }
    try {
      writer.close();
    } catch (IOException e) {
      System.out.println("파일 닫기에 실패.");
    }

  }

}
