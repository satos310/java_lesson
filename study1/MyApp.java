// interface　クラス機能を拡張するための機能

interface Printable {
  // 定数
  double VERSION = 1.2;
  // 抽象メソッド
  void print();     // 抽象メソッドは public abstract を省略できる
  // defaultメソッド
  public default void getInfo() {
    System.out.println("I/F ver. " + Printable.VERSION);
  }
  // staticメソッド　インターフェースに属するメソッド　defaultメソッドの処理が複雑な際にまとめることができる
  
}

class User implements Printable{      // 「implements インターフェース名」で
  @Override
  public void print() {
    System.out.println("Now printint user profile...");
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User();
    tom.print();
    tom.getInfo();
  }

}