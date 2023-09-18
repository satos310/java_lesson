// 配列と反復処理   よく組み合わせで使われる
// 

import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    int [] scores = {70, 90, 80, 60};      // 整数の配列    }のあとは;必要
    // System.out.println(scores[0]);
    // System.out.println(scores[1]);
    // System.out.println(scores[2]);      // ▲要素が多くなると、コードが長くなる
    
    // for (int i = 0; i < 3; i++) {
    for (int i = 0; i < scores.length; i++) {     // 変数.lengthとすることで、配列の要素の数だけ実行する
      System.out.println(scores[i]);      // scoresの配列Noを[i]に代入
    }
  }
}
