// メソッドを介して値を変更する

//
class User {
  String name;
  int score;

  User(String name, int score) {
    this.name = name;
    this.score = score;
  }

  String getUserString() {
    return name + ", " + score; 
  }
  
  void setScore(int score) {
    if (score < 0 || score > 100) {
      System.out.println("Invalid score!");
      return;       // 0~100以外の場合は値の更新が行われないようにする    return -> 処理は途切れない
    }
    this.score = score;
  }
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);
    User user2 = new User("Jiro", 80);
    
    // user1.score = 900;      // 謝って入力ミスが起こしてしまう
    user1.setScore(900);

    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());

  }
}