// 拡張for文を使ってみる
// 単に配列の全ての要素に対して何らかの処理をしたい場合に、すっきりと書くことができる

import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    int [] scores = {70, 90, 80, 60};
    
    // for (int i = 0; i < scores.length; i++) {      // 前章の記述方法   メリット：ブロックの中で i の値を使えるため、それを使った処理を組み立て可
    //   System.out.println(scores[i]);
    // }
    
    for(int score: scores) {      // 拡張for文    for(変数の宣言: 配列の変数名, ブロック)
      System.out.println(score);      // scoreの要素がなくなるまで、各要素を１つずつ変数にセットされていく    ブロックの中の処理を実行
    }
  }
}
