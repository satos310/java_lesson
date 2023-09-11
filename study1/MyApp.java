// 数学関連のクラス   Mathクラス

import java.util.Random;      // randomを使用できるようにする

public class MyApp {

  public static void main(String[] args) {
    double d = 53.234;
    System.out.println(Math.ceil(d));     // 54   ceil...小数点以下切り上げ
    System.out.println(Math.floor(d));     // 53   floor...小数点以下切り捨て
    System.out.println(Math.round(d));     // 53   round...小数点以下四捨五入
    System.out.println(Math.PI);     // PI...円周率を取得   定数
    
    // Math.radom()     // 乱数を発生させる
    Random r = new Random();      // インスタンスを作る
    // ランダムな結果を出す便利なメソッド
    System.out.println(r.nextDouble());     // 0 - 1    r.nextDouble...0以上1未満の浮動小数点数
    System.out.println(r.nextInt(100));     // 0 - 100    r.nextInt...0以上100未満の整数
    System.out.println(r.nextBoolean());     // r.nextBooleanランダムなtrue / falseを取得
  }
}
