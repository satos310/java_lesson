// クラスにメソッドを定義する

//
class User {
  String name;
  int score;

  User(String name, int score) {      // 仮引数の名前をフィールドと同じにすることも可
    this.name = name;     // インスタンスのフィールドにはthis.が付いてることで区別する
    this.score = score;
  }

  String getUserString() {
    // return this.name + ", " + this.score;     // 変数を使ってコードを省略
    return name + ", " + score;     // 仮引数がないため、this.を省略しても動作する()
  }
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);      // 新しくインスタンスを作成する際に値を設定 -> 下記の値の設定が不要

    User user2 = new User("Jiro", 80);

    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());

  }
}