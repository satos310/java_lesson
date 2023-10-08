// Scoreクラスを継承する

// 処理を小クラスに分ける -> 親クラスと同じように動作するため、コードの変更が少なくて済む
class Score {
  private String subject;
  private int score;
  
  Score(String subject, int score) {
    this.subject = subject;
    this.score = score;
  }
  
  private String getResult() {
    return this.score >= 80? "Pass" : "Fails";
  }
  
  String getScoreString() {
    return this.subject + ", " + this.score + ", " +this.getResult();
  }
}

class MathScore extends Score {     // クラス名 extends 継承元クラス名
  MathScore (int score) {     // 引数の数を変えた -> それぞれのクラスでコンストラクターを再定義する必要がある
    // 親クラスのコンストラクタと同じような処理をしたい
    super("Math", score);     // super()    親クラスのコンストラクタを
  }
}
class EnglishScore extends Score {     // クラス名 extends 継承元クラス名
  EnglishScore (int score) {
    super("English", score);
  }
}

class User {
  private String name;
  private Score score;
  User(String name, Score score) {
    this.name = name;
    this.score = score;
  }
  
  String getUserString() {
    return this.name + ", " + this.score.getScoreString();
  }
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User("Taro", new MathScore(70));     // 新しく作ったクラス名のインスタンス作成
    User user2 = new User("Jiro", new EnglishScore(80));     // 新しく作ったクラス名のインスタンス作成
    
    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());
  }
}