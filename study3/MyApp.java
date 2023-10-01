// アクセス修飾子を使う
// 想定外の値を入れない安全なプログラム

// 0~100点から外れた数字をエラーで弾く
class User {
  String name;
  private int score;        // カプセル化   scoreに対してprivateというキーワードをつける -> Userクラスの外からはScoreフィールドにアクセス・取得できなくなる（アクセス修飾子）

  User(String name, int score) {
    this.name = name;
    this.score = score;
  }

  String getUserString() {
    return name + ", " + score;
  }
  
  // setter   フィールドに値をセットするメソッド
  void setScore(int score) {
    if (score < 0 || score > 100) {
      System.out.println("Invalid score!");
      return;       // 0~100以外の場合は値の更新が行われないようにする    return -> 処理は途切れない
    }
    this.score = score;
  }
  
  // getter   値を取得するためのメソッド
  // よく使われるテクニック   安全にアクセスするためのメソッドを別途用意する
  int getScore() {      // privateにしたフィールドの値を取得したい -> メソッドを定義する
    return this.score;      // privateのscoreに対して、インスタンスのscoreを返す    // 返り値はint
  }
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);
    User user2 = new User("Jiro", 80);

    // user1.score = 900;      // 謝って入力ミスが起こしてしまう
    // user1.setScore(900);
    // System.out.println(user1.score);
    System.out.println(user1.getScore());

    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());

  }
}