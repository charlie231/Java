import java.util.Scanner;

public class Hungry {
  public static void main(String[] args) {
    System.out.println("음식이름 입력하셈");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    switch (name) {
      case "치킨":
        System.out.println("치킨1억");
        break;
      case "롯데리아":
        System.out.println("롯리 2억");
        break;
      case "버거킹":
        System.out.println("버거킹500원");
        break;
      default:
        System.out.println("메뉴를 쳐보세여");
    }


  }

}


