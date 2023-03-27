import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collection;
import java.util.*;

public class MapExample {
  public static void main(String[] args) {
    Map<String, String> dictionary = new HashMap<>();
    dictionary.put("chicken", "��");
    dictionary.put("jjajangmeon", "¥����");



    if (dictionary.isEmpty()) {
      System.out.println("�ܾ �ϳ��� �����ϴ�");
      System.exit(0);
    } else {
      System.out.println(dictionary.size() + "���� �ܾ �ֽ��ϴ�");
    }

    Set<Map.Entry<String, String>> entries = dictionary.entrySet();

    for (Map.Entry<String, String> entry : entries) {
      String english = entry.getKey();
      String korean = entry.getValue();

      System.out.println(english + ": " + korean);
    }
  }


}
