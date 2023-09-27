// メソッドをオーバーロードする
// ある名前のメソッドを違う（複数の）データ型の引数に対応させていくことができる

// メソッド名、引数の数、型、順序の組み合わせをメソッドのシグネチャーと呼ぶ。

// 整数を渡すと、それを3回表示してくれる
public class MyApp {
  private static void showThreeTimes(int n) {     // 整数 が渡されたらこのprovateフィールド内のメソッドが実行される
    System.out.println(n);
    System.out.println(n);
    System.out.println(n);
  }
  
  // 「メソッドをオーバーロードする」...同じ名前のメソッドを違うシグネチャーで定義すること
  private static void showThreeTimes(double n) {      // 小数 が渡されたらこのprovateフィールド内のメソッドが実行される
    System.out.println(n);
    System.out.println(n);
    System.out.println(n);
  }
  
  public static void main(String[] args) {
    showThreeTimes(3);
    showThreeTimes(5.2);
  }
}