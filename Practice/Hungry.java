import java.util.Scanner;

public class Hungry {
  public static void main(String[] args) {
    System.out.println("�����̸� �Է��ϼ�");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    switch (name) {
      case "ġŲ":
        System.out.println("ġŲ1��");
        break;
      case "�Ե�����":
        System.out.println("�Ը� 2��");
        break;
      case "����ŷ":
        System.out.println("����ŷ500��");
        break;
      default:
        System.out.println("�޴��� �ĺ�����");
    }


  }

}


