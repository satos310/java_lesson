// Stream API

import java.util.*;     // Stream APIを使用するためのjava.utilパッケージ

public class MyApp {
  public static void main(String[] args) {
    // Stream   複数の値を順番に処理していくための仕組み    // よくArrayListなどの集合データと合わせて使われる
    List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));      // Arrays.asList...宣言と同時に値を入れ込んでいくのに使用（配列を作成）
    
    // 前回までのやり方（値に対して何らかのアクション）   // シンプルな処理しか扱えない
    // for (Integer sale : sales) {
    //   System.out.println();
    // }
    
    // Streamを使用   .stream()を使用する
    sales
      .stream()
      // 0 個以上の中間処理
      .filter(e -> e % 3 == 0)      // ラムダ式を渡すことができる   「引数 -> 処理」の形式
                                    // それぞれの要素がeに入ってくるe%3==0で処理 -> 真の値のものだけ抽出
      // 抽出結果を.map()に渡す
      .map(e -> "(" + e + ")")      // ラムダ式使用可
      // 最後に終端処理に渡す
      .forEach(System.out::println);      // forEach()を使用する際は記述方法が少し違う
    
  }
}
