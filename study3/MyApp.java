// ジェネリクスを使ってみる   データ型をパラメータ化できる

// 下記のメソッドで異なるのはデータ型のみ -> 実行時に指定できるパラメータにする
// パラメータに引数のように好きな名前をつけられる
public class MyApp {
  private static <T> void showThreeTimes(T n) {     // 大文字の「T」がよく使われる    // 返り値の前で<>,  変数名の前で宣言する
    System.out.println(n);
    System.out.println(n);
    System.out.println(n);
  }
  
  // 渡されるデータ型はJavaが自動で判別してくれる
  public static void main(String[] args) {
    showThreeTimes(3);
    showThreeTimes(5.2);
  }
}