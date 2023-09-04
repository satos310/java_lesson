// 抽象クラス　他のクラスに継承してもらうことを前提にしているクラス
// 具象クラス　抽象クラスを継承するクラス

abstract class User {      // abstract -> 抽象クラスになる
  public abstract void sayHi();      // 抽象メソッド　具象クラスに実装を任せるメソッド
}

class JapaneseUser extends User {
  @Override
  public void sayHi() {
    System.out.println("こんにちは!");
  }
}

class AmericanUser extends User {
  @Override
  public void sayHi() {
    System.out.println("Hi!");
  }
}


public class MyApp {

  public static void main(String[] args) {
    AmericanUser tom = new AmericanUser();
    JapaneseUser aki = new JapaneseUser();
    tom.sayHi();
    aki.sayHi();
  }

}