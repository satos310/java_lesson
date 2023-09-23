// メソッドの基本的な構造は「入力(引数) -> 処理 -> 出力(返り値)」
// 仮引数...「仮で変数を使っておく」  メソッドを定義している際に渡している
// 実引数...「実際にこの値を使って」  メソッドを実行する際に渡している

// 
public class MyApp {
  private static int triple(int num) {     // 仮引数     // private static...フィールド：クラス内からのみアクセス可能、　メソッド：クラス内からのみ呼び出し可能
    return num * 3;     // tripleメソッドの処理の中身
  }
  
  public static void main(String[] args) {
    System.out.println(triple(10));     // 実引数 30   // triple...整数値を３倍にする
    System.out.println(triple(4) * 3);      // 実引数 36
  }
}
