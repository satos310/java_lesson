// ユーザーから入力を受け取る

import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    System.out.print("Score? ");     // 入力を促すメッセージ    // println -> 次の処理が改行, print -> 次の処理が同行で実行される
    int num = new Scanner (System.in).nextInt();     // ユーザーから整数値を受け取り可   // int num = とすることで、入力された値を変数に代入
    System.out.println(num);
  }
}
