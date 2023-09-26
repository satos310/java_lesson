// 仮引数のスコープ

// 整数値を3倍に返す
public class MyApp {
  private static int triple(int num) {
    return num * 3;
  }
  
  public static void main(String[] args) {
    int num = 100;
    System.out.println(triple(10));
    System.out.println(num);      // 100    // privateフィールド（スコープ）のnumとは違う変数として扱われる
  }
}