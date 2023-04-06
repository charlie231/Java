import java.util.Scanner;

public class CeaserCipher {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("��ȣ ��ȣȭ �ý���");
    System.out.println("1: ����");
    System.out.println("2: ����");

    // while��
    int t = sc.nextInt();

    while (t < 2) {
      if (t == 1) {
        System.out.println("��� �Է�");
        System.out.println("1: ��ȣ�� ����");
        System.out.println("2: ��ȣ�� ����");
        System.out.println("3: ���");

        int command = sc.nextInt();

        switch (command) {
          // ��ȣȭ
          case 1: {
            System.out.println("�� �Է�");
            String a1 = sc.nextLine(); // �ι��Է� ����
            String a = sc.nextLine();
            System.out.println("������ ���� �Է�");
            int shift = sc.nextInt();
            String EncryptedText = encrypt(a, shift);
            System.out.println("Encrypted text: " + EncryptedText);
            break;
          }

          // ��ȣȭ
          case 2: {
            System.out.println("��ȣ�� �Է�");
            String b = sc.nextLine();
            System.out.println("������ ���� �Է�");
            int shift = sc.nextInt();
            String deencryptedText = deEncrypt(b, shift);
            System.out.println("DeEncrypted text: " + deencryptedText);
            break;
          }

          case 3: {
            break;
          }
        }
      }
    }



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


