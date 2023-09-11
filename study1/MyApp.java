// HashMapクラス

import java.util.*;     // HashSetを使用するためのjava.utilパッケージ

public class MyApp {

  public static void main(String[] args) {
    // HashMap    複数データを管理するためのもの    keyとvalueでデータを管理    // 追加したデータの順番が不定
    // TreeMap    keyの順番でデータを保持
    // LinkedHashMap    データが追加された順番でデータを保持

    // HashMap<String, Integer> sales = new HashMap<>();      // key: Stringとvalue: valueの型を指定
    Map<String, Integer> sales = new HashMap<>();     // HashSet : SetのようにHashMap: Map型のインターフェースで宣言可

    sales.put("tom", 10);
    sales.put("bob", 20);
    sales.put("steve", 30);

    System.out.println(sales.get("tom"));     // get() -> 要素の取得, key(tom)の取得   // vakue（値）は10
    System.out.println(sales.size());     // size() -> 要素の個数も取得できる -> 3

    for (Map.Entry<String, Integer> sale : sales.entrySet()) {     // Map.Entry: 全ての中身を確認, entrySet: <Integer, String>の組み合わせを一つずつ扱うループ
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }

    sales.put("tom", 100);     // put: 値の更新
    sales.remove("steave");      // 要素の削除

    for (Map.Entry<String, Integer> sale : sales.entrySet()) {
      System.out.println(sale.getKey() + ":" + sale.getValue());
    }
  }
}
