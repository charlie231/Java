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
      System.out.println(attempt + "ȸ �õ���");
    }
    System.out.println("���� ����");
  }

  public static boolean play() {
    System.out.println("���� �Է�");
    int input = scanner.nextInt();

    if (input == randomNumber) {
      System.out.println("�A�A.");
      return true;
    } else if (input > randomNumber) {
      System.out.println("�� �������Դϴ�");

    } else if (input < randomNumber) {
      System.out.println("�� ū���Դϴ�");
    }
    return false;

  }

}
