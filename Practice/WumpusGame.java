import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class WumpusGame {
  public static void main(String[] args) {
    int[] rooms = {0, 1, 2, 3};

    String BAT = "BAT";
    String PIT = "PIT";
    String WUMPUS = "WUMPUS";
    String NOTHING = "NOTHING";

    String[] hazards = {NOTHING, BAT, PIT, WUMPUS};

    HashMap<String, String> hazardMessages = new HashMap<>();

    hazardMessages.put(WUMPUS, "\"��𼱰� ������ ������ ����\"");
    hazardMessages.put(BAT, "\"��𼱰� �ν����Ÿ��� �Ҹ��� �鸰��.\"");
    hazardMessages.put(PIT, "\"�ٶ��� �δ� �Ҹ��� �鸮�°� ����.\"");
    hazardMessages.put(NOTHING, "\"�� �濡�� �ƹ��͵� ���°� ����.\"");



    int[][] links = {{1, 2, 3}, {2, 3, 0}, {1, 3, 0}, {0, 1, 2}};

    int currentRoom = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("����" + currentRoom + "�� �濡 �ֽ��ϴ�");

      int[] nextRooms = links[currentRoom];

      for (int nextRoom : nextRooms) {
        String hazard = hazards[nextRoom];
        String message = hazardMessages.get(hazard);
        System.out.println(message);

      }


      System.out.println("���� ��ȣ �߿��� �̵��� �� ��ȣ�� �����ϼ���");

      System.out.println(Arrays.toString(links[currentRoom]));

      int roomNumber = scanner.nextInt();

      currentRoom = roomNumber;
    }

  }

}
