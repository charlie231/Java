import java.util.Random;
import java.util.Scanner;

public class UpAndDownWtihMethod {

  public static int randomNumber;
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Random random = new Random();
    randomNumber = random.nextInt(256);

    int attempt = 0;

    while (attempt < 8) {
      boolean isCorrect = play();


      if (isCorrect) {
        break;
      }

      attempt = attempt + 1;
      System.out.println(attempt + "회 시도함");
    }
    System.out.println("게임 종료");
  }

  public static boolean play() {
    System.out.println("숫자 입력");
    int input = scanner.nextInt();

    if (input == randomNumber) {
      System.out.println("짞짞.");
      return true;
    } else if (input > randomNumber) {
      System.out.println("더 작은수입니다");

    } else if (input < randomNumber) {
      System.out.println("더 큰수입니다");
    }
    return false;

  }

}
