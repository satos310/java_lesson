// ユーザーから入力を受け取る
// if文で条件分岐   比較演算子

import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    System.out.print("Score? ");     // 
    int score = new Scanner (System.in).nextInt();     // 
    // if (score >= 90) {
    //   System.out.println("A!");
    // } else if (score >= 70) {     // 条件を上から見てる -> 条件を満たす -> それ以降の条件については判定しない
    //   System.out.println("Not B!");
    // } else {
    //   System.out.println("Not C!");
    // }
    
    if (score >= 90) {
      System.out.println("A!");     // A!の条件に当てはまっている
    } else if (score >= 95) {
      System.out.println("super!!");      // else ifは実行されない
    } else {
      System.out.println("Not C!");
    }
  }
}
