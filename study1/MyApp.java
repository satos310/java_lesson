import java.util.*;     // ArrayListを使用するためのjava.utilパッケージ

public class MyApp {
  // 売上管理
  public static void main(String[] args) {
    // ArrayList    後から要素を追加・削除可  配列と似てる
    // LinkedList   ✕検索　◯追加／削除      // 今回のリストでは

    // ArrayListだけで使えるメソッドはあまり使わない -> ArrayListが実装しているList型のインターフェースで宣言
    // ArrayList<Integer> sales = new ArrayList<>();     // ジェネリクスを使った型
    List<Integer> sales = new ArrayList<>();     // ジェネリクスを使った型

    sales.add(10);
    sales.add(20);
    sales.add(30);

    for (int i = 0; i < sales.size(); i++) {      // size...要素の個数が取れる
      System.out.println(sales.get(i));     // それぞれの要素は0番目から始まっているので、get(i)
    }

    // 要素の変更と削除
    sales.set(0, 100);      // 変更 -> sales.set()メソッド   0番目の要素を100に変更
    sales.remove(2);      // 削除 -> sales.remove()メソッド   2番目（今回でいう最後）の要素を削除

    // 上記のfor文の違う書き方
    for (Integer sale : sales) {      // size...要素の個数が取れる
      System.out.println(sale);     // それぞれの要素は0番目から始まっているので、get(i)
    }
  }
}
