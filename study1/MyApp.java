// 列挙型　　データ型の一つ   // 定数をまとめたもの   （中にフィールドやメソッドを持つことができる）

enum Result {     // 列挙型 -> enumを使用
  SUCCESS,      // 0    // 最後の , は無くてもいい    // データを追加する時などに便利
  ERROR,      // 1    //  列挙型を定義 -> ordinal()というメソッドが定義され、0からはじまる連番がセットされる
}

public class MyApp {

  public static void main(String[] args) {
    Result res;

    res = Result.ERROR;

    switch(res) {
      case SUCCESS:
        System.out.println("OK!");
        System.out.println(res.ordinal());     // 0
        break;
      case ERROR:
        System.out.println("NG!");
        System.out.println(res.ordinal());     // 1
        break;
    }
  }

}