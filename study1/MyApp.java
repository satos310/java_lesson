// do...while文
// 条件判定(while)が後ろに来ているため、必ず最初に1回処理が実行される
// 使用条件 : 繰り返す回数がわからない && 最初に必ず1回は処理を実行したい
//            ネットワーク越しにデータを取得してみて、何らかのエラーが発生したら何度でも再取得したい
// 使用頻度: △

import java.util.Scanner;

// パスワードを入力してもらって、間違えていたら入力し直してもらう
public class MyApp {
  public static void main(String[] args) {
    String password;
    do {
      password = new Scanner(System.in).next();
    } while (password.equals("d0t1nsta11") == false);     // equals.を使用することで、変数password(入力された値)と()内の値を比較する
    System.out.println("Password matched");
  }
}
