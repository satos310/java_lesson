// 例外   // プログラムの実行中に予期しない結果が発生した時の処理

class MyException extends Exception {     // bが例外の時用の設定
  public MyException(String s) {
    super(s);
  }
}

public class MyApp {
  
  public static void div(int a, int b) {
    try {     // 例外が発生しそうな箇所をtryで囲む
    if (b < 0) {
      throw new MyException("not minus!");      // if文がyes -> コンストラクタを投げる
    }
      System.out.println(a / b);
    } catch(ArithmeticException e) {      // 例外をcatch    // catch()内に例外のワード + e を入れる
      System.err.println(e.getMessage());     // errとすることで、標準 -> エラー出力する
    } catch(MyException e) {
      System.err.println(e.getMessage());
    } finally {     // 例外の有無に限らず、最後に後処理を設定するブロック
      System.err.println(" -- ebd --");
    }
  }
  
  public static void main(String[] args) {
    div(3, 0);
    div(5, -2);
  }

}