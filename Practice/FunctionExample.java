import java.util.Arrays;

public class FunctionExample {
  public static void main(String[] args) {
    sayHello();
    sayHelloTo("Chicken");
    printSum(2, 3);
    int result = sum(5, 6);
    System.out.println(result);

    int[] sumAndProduct = addAndMultiply(2, 3);
    System.out.println(Arrays.toString(sumAndProduct));
    boolean saidHola = sayHala("�ٺ�");
    System.out.println(saidHola);

  }

  public static boolean sayHala(String name) {
    if (name.equals("�ٺ�")) {
      System.out.println("����ض�");
      return false;
    }
    System.out.println(name + "��, �ȳ��ϼ���?");
    return true;

  }

  public static int[] addAndMultiply(int a, int b) {
    int sum = a + b;
    int product = a * b;

    int[] result = {sum, product};


    return result;


  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static void printSum(int a, int b) {
    System.out.println(a + "+" + b + " =" + sum(a, b));
  }

  public static void sayHelloTo(String name) {
    System.out.println("Hello" + name);
  }

  public static void sayHello() {
    System.out.println("Hello");
  }
}

