// scannerを使うには少し長い記述が必要
import java.util.Scanner;     // 最初にimportを宣言 → scannerと打つだけで良くなる

public class numberGuess {
  public static void main(String[] args) {      // Javaを実行するにはclassとmainメソッドが必要
    System.out.print("What Your name? ");     // println → Terminal上で次の処理が改行される
    String name = new Scanner(System.in).next();      // キーボードからの入力を受け取る
    // String name = "Shirata";      // 変数に値を割り当てる → 「変数に値を代入する」
  
    System.out.println("hello " + name);
    System.out.println("hello " + name + " again!");
  }
}