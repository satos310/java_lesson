// ユーザーから入力を受け取る
// if文で条件分岐   比較演算子
// 条件分岐で文字列を扱う   // 信号機の色を入れたら、それに対応するメッセージの表示

import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    System.out.print("Signal? ");     // 
    String signal = new Scanner (System.in).next();     // 文字列を受け取りたい -> next,  数字を受け取りたい -> nextInt
    
    // if (signal == "red") {     // この形式でも物理的に「色（文字列）」を判別することはできる
    // }

    if (signal.equals("red") == true) {     // 変数.equals(比較したい文字列) -> 「文字列が同じかどうか比較する際に使う特別な命令
      System.out.print("Stop");
    } else {
      System.out.println("Not red");
    }
  }
}
