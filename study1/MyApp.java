// 返り値のないメソッドを実装

// 2つの整数値を渡す -> 合計して返してくれる    sumメソッド
public class MyApp {
  private static int sum(int a, int b) {      // 1.返り値があるメソッド -> 返り値の結果を使って他の演算ができる
    return a + b;
  }

  private static void showSum(int a, int b) {     // 2.showSumメソッド -> 合計を表示するだけであれば直接指示可
                                                  // returnがないため、int -> void（何も返さない）にする必要有
    System.out.println(a + b);
  }
  
  public static void main(String[] args) {
    System.out.println(sum(3, 7));
    showSum(3, 7);
  }
}
