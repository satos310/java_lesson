// break, continueを使ってみる    ループを途中で抜ける

import java.util.Scanner;

// 
public class MyApp {
  public static void main(String[] args) {
    int[] scores = {70, -10, 80, 90};      // 点数を配列で配布
    for (int score: scores) {     // 拡張型for文
      if (score < 0) {
        // break;      // 途中でループを抜け出す   プログラムを終了させる訳では無い -> "Finished"は表示される -> 70 Finished
        continue;     // if文の該当データをスキップして次の処理を継続 -> 70 80 90 Finished
      }
      System.out.println(score);
    }
    
    System.out.println("Finished");
  }
}
