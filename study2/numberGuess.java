// scannerを使うには少し長い記述が必要
import java.util.Scanner;     // 最初にimportを宣言 → scannerと打つだけで良くなる
import java.util.Random;      // Randomのimport

// Q. publicと付ける理由は？  他のレッスンではclass前につけないものもあった。
public class numberGuess {
  public static void main(String[] args) {      // Javaを実行するにはclassとmainメソッドが必要
  //   System.out.print("What Your name? ");     // println → Terminal上で次の処理が改行される
  //   String name = new Scanner(System.in).next();      // キーボードからの入力を受け取る
  //   // String name = "Shirata";      // 変数に値を割り当てる → 「変数に値を代入する」
  
  //   System.out.println("hello " + name);
  //   System.out.println("hello " + name + " again!");
  
    Integer answer = new Random().nextInt(10) + 1;      // nextInt(10) → 0～9までのランダムな数値がanswerに代入される → +1して0～10の数値が入る
    
    while (true) {
      // Q. intとIntegerに違いはあるか？
      System.out.print("Your guess? ");
      int guess = new Scanner(System.in).nextInt();     // 整数値を受け取る際はnextInt
      // System.out.println("Your guess: " + guess);
      
      if (answer == guess) {
        System.out.println("Bingo!");
        break;
      } else if (answer > guess) {
        System.out.println("The answer is higher!");
      } else {
        System.out.println("The answer is lower!");
      }
    }
    
    System.out.println("The answer was " + answer);
  }
}