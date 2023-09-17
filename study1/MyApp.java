// ユーザーから入力を受け取る
// if文で条件分岐   比較演算子
// 条件分岐で文字列を扱う   // 信号機の色を入れたら、それに対応するメッセージの表示
// switch文で条件分岐     // red, blue , yellowのように取り得る値が決まっている場合、if...elseよりもすっきり書ける場合もある

import java.util.Scanner;

public class MyApp {
  public static void main(String[] args) {
    System.out.print("Signal? ");     // 
    String signal = new Scanner (System.in).next();     // 文字列を受け取りたい -> next,  数字を受け取りたい -> nextInt
    
    switch (signal) {     // signalの取りうる値（変数の中身）に対しての処理
      case "red":
        System.out.println("Stop");
        break;
        
      case "yellow":
        System.out.println("Slow down");
        break;
        
      case "blue":
      case "green":     // 条件に"又は"を作りたいときは、caseを縦に並べるだけ
        System.out.println("Go");     // "blue"または"green"の時にGoと表示させる
        break;
        
      default:      // どのcaseにも当てはまらない場合（if文でいうelseのようなもの）
        System.out.println("Wong signal");
        break;
    }
  }
}
