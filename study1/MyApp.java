// 条件演算子
// ◯シンプルな処理   ✕複雑な処理（コードが読みにくくなる

import java.util.Scanner;

// 
public class MyApp {
  public static void main(String[] args) {
    int score = new Scanner(System.in).nextInt();
    String result = score >= 90 ? "A!" : "B!";      // score >= 80の条件が成立 -> A!(１つ目),   不成立 -> B!(２つ目)のデータを返す
    // String result = if(score >= 90) { "A!"; } else { "B!"; }     // if文は使用不可   why ifはあくまでも何らかの処理をする命令文であって、最終的に値になるわけではない
                                                                    //  -> 変数や定数に代入は不可
    
    System.out.println(result);
  }
}
