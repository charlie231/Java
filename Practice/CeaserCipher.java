import java.util.Scanner;

public class CeaserCipher {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 문자 입력받음
    String a = sc.nextLine();
    // 3만큼 이동
    int shift = 3;
    String encryptedText = encrypt(a, shift);
    System.out.println("Encrypted text: " + encryptedText);
  }


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
        encryptedText.append(ch + "는 알파벳이 아닙니다.\n");
      }
    }

    return encryptedText.toString();
  }


}

