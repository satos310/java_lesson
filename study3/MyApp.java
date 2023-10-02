// クラス変数を使ってみる

// Userクラスからいくつインスタンスが作られたかを表示する
class User {
  String name;              // インスタンス変数...個々のインスタンスに関する値を保持する変数
  int score;                // インスタンス変数
  static int count = 0;     // クラス変数...クラス全体に関する値を保持する変数      // static  クラス全体で1つの値だけを管理する変数にしたい
  // staticをつけない -> nameやscore同様、インスタンスごとにcount= 0の値が維持されてしまう

  User(String name, int score) {
    this.name = name;
    this.score = score;
    User.count++;     // インスタンスを作るたびにcount++ -> 「Userクラスに紐づく変数」と分かるように先頭にクラス名(User)をつける
  }
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);
    User user2 = new User("Jiro", 80);

    System.out.println(User.count);      // Userクラスの外でcount変数を使う -> 先頭にクラス名必須(User)

  }
}