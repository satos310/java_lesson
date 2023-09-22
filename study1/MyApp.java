// 論理演算子
// AなおかつB -> A && B,    AまたはB -> A || B,   Aではない -> !A

import java.util.Scanner;

// EnglishとMathの点数を受け取り、その値によって処理を条件分岐させる
public class MyApp {
  public static void main(String[] args) {
    System.out.print("English? ");
    int english = new Scanner(System.in).nextInt();
    System.out.print("Math? ");
    int math = new Scanner(System.in).nextInt();
    
    if (!(english >= 80 && math >= 80)) {     // !を頭につけることで、動作が逆になり「どちらも80点以下の時」にA!と表示される
      System.out.println("A!");
    } else {
      System.out.println("B!");
    }
  }
}
