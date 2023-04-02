import java.util.Scanner;

public class CeaserCipher {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // ���� �Է¹���
    System.out.println("�� �Է�");
    String a = sc.nextLine();

    System.out.println("�ű� ���� �Է�");
    // �Է¹�����ŭ �̵�
    int shift = sc.nextInt();

    // �Լ��� �Է�
    String encryptedText = encrypt(a, shift);
    String deEncryptedText = deEncrypt(encryptedText, shift);

    System.out.println("Encrypted text: " + encryptedText);
    System.out.println("DeEncrypted text: " + deEncryptedText);
  }


  // ��ȣȭ �Լ�
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
        encryptedText.append(ch);
      }
    }
    return encryptedText.toString();
  }

  // ��ȣȭ
  public static String deEncrypt(String deencryptedText, int shift) {
    StringBuilder deEncryptedText = new StringBuilder();

    for (int i = 0; i < deencryptedText.length(); i++) {
      // ���ڿ��� ���ڷ� ��ȯ
      char ch = deencryptedText.charAt(i);
      int num;

      // ���ڰ� ������
      if (Character.isLetter(ch)) {
        num = (int) ch;
        // �빮��
        if (num < 90) {
          char shifted = (char) ('A' + (ch - 'A' - shift) % 26);
          deEncryptedText.append(shifted);
        }
        // �ҹ���
        else if (num >= 97 || num < 123) {
          char shifted = (char) ('a' + (ch - 'a' - shift) % 26);
          deEncryptedText.append(shifted);
        }
      }

      // ���ڰ� �ƴҽ�
      else {
        deEncryptedText.append(ch);
      }
    }

    return deEncryptedText.toString();
  }


}

