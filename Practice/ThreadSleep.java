public class ThreadSleep {
  public static void main(String[] args) {
    System.out.println("���������ϴ��� ���纼�Կ�");

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("���!");
  }

}
