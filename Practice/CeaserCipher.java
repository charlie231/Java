import java.util.Scanner;

public class CeaserCipher {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 문자 입력받음
    System.out.println("평문 입력");
    String a = sc.nextLine();

    System.out.println("옮길 숫자 입력");
    // 입력받은만큼 이동
    int shift = sc.nextInt();

    // 함수에 입력
    String encryptedText = encrypt(a, shift);
    String deEncryptedText = deEncrypt(encryptedText, shift);

    System.out.println("Encrypted text: " + encryptedText);
    System.out.println("DeEncrypted text: " + deEncryptedText);
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

