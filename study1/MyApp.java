// 真偽値を返すメソッドを実装

// isDividableメソッド    ある整数値を他の整数値で割り切れるかを、trueまたはfalseの真偽値で返す
public class MyApp {
  private static boolean isDividable(int a, int b) {
    if (a % b == 0) {
      return true;
    } else {
      return false;
    }
    // System.out.println(isDividable("---end---"));      // returnされた時点で処理は呼び出し元に戻るため、それ以降は実行されない
  }
  
  public static void main(String[] args) {
    System.out.println(isDividable(10, 2));     // true
    System.out.println(isDividable(10, 3));     // false
    // System.out.println(isDividable(10, 0));     // errorが起きる
  }
}