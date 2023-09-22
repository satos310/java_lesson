// スコープについて
// 変数や定数が有効である範囲のこと
// スコープが異なれば同じ名前で変数を宣言することができる(変数の使い回し可)

import java.util.Scanner;

// EnglishとMathの点数を受け取り、その値によって処理を条件分岐させる
public class MyApp {
  // public static void main(String[] args) {
  //   int amount = 120;
    
  //   if (amount > 0) {
  //     int sales = 100 * amount;     // 変数は宣言されたブロックの中の宣言された箇所以降(以下)で有効　 Javaのルール
  //     System.out.println(sales);
  //   }
    
    // System.out.println(sales);     // 宣言されたブロック外になるため、salesは使えない
    
    for (let i = 0; i < 3; i++) {     // 変数iのスコープはfor{}内になる
      System.out.println(i);
    }
    
    // System.out.println(i);     // iは宣言箇所から見てブロック外になるため、使用不可
  }
}
