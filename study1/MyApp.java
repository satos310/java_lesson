// printfメソッド   System.out.printf()というメソッドを使用することで、文字列の書式を指定できる

public class MyApp {

  public static void main(String[] args) {
    
    int score = 50;
    double height = 165.8;
    String name = "taguchi";
    
    System.out.printf("name: %s, score: %d, height: %f\n", name, score, height);      // 文字列 -> %s, 整数値 -> %d, 浮動小数手数 -> %f   // \n を書式指定の最後に入れつことで改行
    System.out.printf("name: %-10s, score: %10d, height: %5.2f\n", name, score, height);      // 表示する桁数を指定    // 10 ... 右詰め, -10 ... 左詰め    // %5.2f ... 整数部分5桁・小数点以下2桁
    
    String s = String.format("name: %10s, score: %-10d, height: %5.2f\n", name, score, height);     // 文字列として受け取れるように -> Stringの変数にStringのformat()でデータを受け取る
    System.out.println(s);
  }
}
