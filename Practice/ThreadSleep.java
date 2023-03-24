public class ThreadSleep {
  public static void main(String[] args) {
    System.out.println("¹«½¼»ý°¢ÇÏ´ÂÁö ¸ÂÃçº¼°Ô¿ä");

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("±è¹ä!");
  }

}
