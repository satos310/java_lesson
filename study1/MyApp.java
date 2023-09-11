// HashSetクラス

import java.util.*;     // HashSetを使用するためのjava.utilパッケージ

public class MyApp {

  public static void main(String[] args) {
    // HashSet    同様複数のデータを扱う(ArrayListと同じ)   // ArrayListとの相違点・重複を許さない　・データを保持する順番が定まらない（ランダムではない）
    // TreeSet    値順にソートされる
    // LinkedHashSet    追加された順を保持する
    
    // HashSet<Integer> sales = new HashSet<>();
    Set<Integer> sales = new HashSet<>();     // ArrayListと同様にSetインターフェース型で宣言可
    
    sales.add(10);
    sales.add(20);
    sales.add(30);
    sales.add(10);      // 同じ値を追加しても、「重複を許さない」-> 要素は増えない, 「順番が定まらない」-> 『○番目を取り出す』ができない
    
    System.out.println(sales.size());     // sizeメソッドで要素の個数を取得することはできる   // 3
    
    for (Integer sale : sales) {      // for文を使用して要素の中身全てを取り出す
      System.out.println(sale);      // 取り出す順番は保証されない
    }
    
    sales.remove(30);     // 要素の削除 -> 直接選択して削除
    
    for (Integer sale : sales) {      // for文を使用して要素の中身全てを取り出す
      System.out.println(sale);      // 取り出す順番は保証されない
    }
  }
}
