import java.util.Scanner;

public class CeaserCipher {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // ���� �Է¹���
    String a = sc.nextLine();
    // 3��ŭ �̵�
    int shift = 3;
    String encryptedText = encrypt(a, shift);
    System.out.println("Encrypted text: " + encryptedText);
  }


  public static String encrypt(String plainText, int shift) {
    StringBuilder encryptedText = new StringBuilder();

    for (int i = 0; i < plainText.length(); i++) {
      // ���ڿ��� ���ڷ� ��ȯ
      char ch = plainText.charAt(i);
      int num;
      // ���ڰ� ������
      if (Character.isLetter(ch)) {
        num = (int) ch;
        // �빮��
        if (num < 90) {
          char shifted = (char) ('A' + (ch - 'A' + shift) % 26);
          encryptedText.append(shifted);
        }
        // �ҹ���
        else if (num >= 97 || num < 123) {
          char shifted = (char) ('a' + (ch - 'a' + shift) % 26);
          encryptedText.append(shifted);
        }
      }

      // ���ڰ� �ƴҽ�
      else {
        encryptedText.append(ch + "�� ���ĺ��� �ƴմϴ�.\n");
      }
    }

    return encryptedText.toString();
  }


}

