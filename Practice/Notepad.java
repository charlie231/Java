import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Notepad {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("원하는 작업 번호 입력");
      System.out.println("1. 메모읽기");
      System.out.println("2. 새 메모");
      System.out.println("3. 종료");

      int taskNum;

      try {
        String input = sc.nextLine();
        taskNum = Integer.parseInt(input);
        // sc int로 바꾸기
      } catch (NumberFormatException e) {
        System.out.println("잘못된 입력");
        continue;
      }
      if (taskNum == 1) {
        System.out.println("메모 파일명을 입력");

        String fileName = sc.nextLine();
        FileInputStream inputStream = null;

        try {
          inputStream = new FileInputStream(fileName);

        } catch (FileNotFoundException e) {
          System.out.println("파일 존재 안함");
          continue;
        }
        System.out.println(fileName + "의 내용을 출력");
        Scanner reader = new Scanner(inputStream);

        while (reader.hasNextLine()) {
          System.out.println(reader.nextLine());
        }
        System.out.println("\n");

        reader.close();
      }

      else if (taskNum == 2) {
        System.out.println("저장할 메모 파일명을 입력해라");
        String fileName = sc.nextLine();
        FileWriter writer = null;


        try {
          writer = new FileWriter(fileName);

        } catch (IOException e) {
          System.out.println("파일 생성 실패");
          continue;
        }
        System.out.println("메모할 문자열을 입력");
        System.out.println("종료: 빈줄에서 엔터 입력");

        while (true) {
          String input = sc.nextLine();
          if (input.equals("")) {
            break;
          }

          try {
            writer.write(input);
            writer.write("\n");
          } catch (IOException e) {
            System.out.println("파일에 문자열을 못씀");
          }
        }

        try {
          writer.close();
        } catch (IOException e) {
          System.out.println("파일을 닫는데 실패");
        }

      }

      else if (taskNum == 3) {
        System.out.println("프로그램 종료");
        break;

      }

      else {
        System.out.println("잘못된 입력이요 ㅋㅋ");
      }

    }

  }

}
