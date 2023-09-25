// 真偽値を返すメソッドを実装

// isDividableメソッド    ある整数値を他の整数値で割り切れるかを、trueまたはfalseの真偽値で返す
public class MyApp {
  private static boolean isDividable(int a, int b) {
    // 方法1
    // if (b != 0 && a % b == 0) {     // &&論理演算子を使用して文章を簡略化
    //   return true;
    // } else {
    //   return false;
    // }
    
    // 方法2
    // if (b == 0) {
    //   return false;     // 早期リターン   最初にイレギュラーなケースを除外させる
    // }
    // if (a % b == 0) {
    //   return true;
    // } else {
    //   return false;
    // }
    
    // 方法3
    if (b == 0) {
      return false;     // 早期リターン
    }
    return a % b == 0;     // 条件演算子を使った表現 -> 条件が成立したらtrue, 成立しなかったらfalseの値に置き換わる -> この表現そのものを渡しても同じ結果になる
    
    // System.out.println(isDividable("---end---"));      // returnされた時点で処理は呼び出し元に戻るため、それ以降は実行されない
  }
  
  public static void main(String[] args) {
    System.out.println(isDividable(10, 2));     // true
    System.out.println(isDividable(10, 3));     // false
    System.out.println(isDividable(10, 0));     // false
  }
}