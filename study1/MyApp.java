// final: 変更ができない

final class User {      // このclassは継承できなくなる
  protected String name;
  private static final double VERSION = 1.1;      // 定数(VERSION)にする場合にfinalを使う, staticとfinalを併せてつかうことで一意性を持たせた変数を作れる。

  public User(String name) {
    this.name = name;
    User.VERSION = 1.2;
  }

  public final void sayHi() {     // このメソッドはorverrideできなくなる
    System.out.println("hi! " + this.name);
  }
}

class AdminUser extends User {

  public AdminUser(String name) {
    super(name);
  }

  @Override
  public void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }

}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom");
  }

}