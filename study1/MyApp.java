// ユーザーから入力を受け取る
// if文で条件分岐

import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    System.out.print("Score? ");     // 
    int score = new Scanner (System.in).nextInt();     // 
    if (score >= 90) {
      System.out.println("A!");
    } else {
      System.out.println("Not A!");
    }
  }
}
