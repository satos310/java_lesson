// フィールドの値にアクセスする

// user1, user2のインスタンス -> それぞれの値のnameやscoreフィールドに値をセットしていく
class User {
  String name;
  int score;
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User();
    user1.name = "Taro";      // user1のnameフィールドに値を設定したい
    user1.score = 70;
    
    User user2 = new User();
    user2.name = "Jiro";      // user2のnameフィールドに値を設定したい
    user2.score = 80;
    
    System.out.println(user1.name);
    System.out.println(user1.score);
    System.out.println(user2.name);
    System.out.println(user2.score);
  }
}