import java.util.Scanner;

public class CeaserCipher {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("암호 복호화 시스템");
    System.out.println("1: 시작");
    System.out.println("2: 종료");

    // while문
    int t = sc.nextInt();

    while (t < 2) {
      if (t == 1) {
        System.out.println("모드 입력");
        System.out.println("1: 암호문 생성");
        System.out.println("2: 암호문 생성");
        System.out.println("3: 취소");

        int command = sc.nextInt();

        switch (command) {
          // 암호화
          case 1: {
            System.out.println("평문 입력");
            String a1 = sc.nextLine(); // 두번입력 무시
            String a = sc.nextLine();
            System.out.println("움직일 숫자 입력");
            int shift = sc.nextInt();
            String EncryptedText = encrypt(a, shift);
            System.out.println("Encrypted text: " + EncryptedText);
            break;
          }

          // 복호화
          case 2: {
            System.out.println("암호문 입력");
            String b = sc.nextLine();
            System.out.println("움직일 숫자 입력");
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



  // 암호화 함수
  public static String encrypt(String plainText, int shift) {
    StringBuilder encryptedText = new StringBuilder();

    for (int i = 0; i < plainText.length(); i++) {
      // 문자열을 문자로 변환
      char ch = plainText.charAt(i);
      int num;

      // 문자가 맞을시
      if (Character.isLetter(ch)) {
        num = (int) ch;
        // 대문자
        if (num < 90) {
          char shifted = (char) ('A' + (ch - 'A' + shift) % 26);
          encryptedText.append(shifted);
        }
        // 소문자
        else if (num >= 97 || num < 123) {
          char shifted = (char) ('a' + (ch - 'a' + shift) % 26);
          encryptedText.append(shifted);
        }
      }

      // 문자가 아닐시
      else {
        encryptedText.append(ch);
      }
    }
    return encryptedText.toString();
  }


  // 복호화
  public static String deEncrypt(String deencryptedText, int shift) {
    StringBuilder deEncryptedText = new StringBuilder();

    for (int i = 0; i < deencryptedText.length(); i++) {
      // 문자열을 문자로 변환
      char ch = deencryptedText.charAt(i);
      int num;

      // 문자가 맞을시
      if (Character.isLetter(ch)) {
        num = (int) ch;
        // 대문자
        if (num < 90) {
          char shifted = (char) ('A' + (ch - 'A' - shift) % 26);
          deEncryptedText.append(shifted);
        }
        // 소문자
        else if (num >= 97 || num < 123) {
          char shifted = (char) ('a' + (ch - 'a' - shift) % 26);
          deEncryptedText.append(shifted);
        }
      }

      // 문자가 아닐시
      else {
        deEncryptedText.append(ch);
      }
    }

    return deEncryptedText.toString();
  }
}


