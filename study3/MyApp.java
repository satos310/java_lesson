// コンストラクタを使用する

// 
class User {
  String name;
  int score;
  
  // constructor
  // User(String nameFromNew, int scoreFromNew) {     // コンストラクタの仮引数
  //   this.name = nameFromNew;     // this.  このクラスからインスタンスが作られていることを明示
  //   this.score = scoreFromNew;
  // }
  User(String name, int score) {      // 仮引数の名前をフィールドと同じにすることも可
    this.name = name;     // インスタンスのフィールドにはthis.が付いてることで区別する
    this.score = score;
  }
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);      // 新しくインスタンスを作成する際に値を設定 -> 下記の値の設定が不要
    // user1.name = "Taro";      // user1のnameフィールドに値を設定したい
    // user1.score = 70;
    
    User user2 = new User("Jiro", 80);
    // user2.name = "Jiro";      // user2のnameフィールドに値を設定したい
    // user2.score = 80;
    
    System.out.println(user1.name);
    System.out.println(user1.score);
    System.out.println(user2.name);
    System.out.println(user2.score);
  }
}