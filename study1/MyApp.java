// for文
// Helloを３回表示させる

import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    // for(int i = 0; i < 3; i++) {      // ①   下記①〜③は全て同じ結果    単純に指定した回数だけ処理を行いたい場合によく使われる
    // for(int i = 1; i < 4; i++) {      // ②   初期値は0でなくてもOK
    for(int i = 1; i <= 3; i++) {      // ③
      System.out.println(i + " Hello");     // "Hello"の前にi(変数)を持ってくることで、回数を表示させる
    }
    
  }
}
