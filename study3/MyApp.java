// 抽象メソッドを使う   abstract

// 抽象メソッドを使用 -> クラスの頭にもabstractをつける
abstract class Score {
  private String subject;
  protected int score;

  Score(String subject, int score) {
    this.subject = subject;
    this.score = score;
  }
  
  // // abstract(抽象メソッド)   「メソッドを小クラスで必ず実装する」 -> 実装されないとエラーで教えてくれる
  protected abstract String getResult();      // 抽象メソッド...実装がなく不完全 -> このクラス自体からはインスタンス作成不可
    // return this.score >= 80? "Pass" : "Fails";
  // }

  String getScoreString() {
    return this.subject + ", " + this.score + ", " +this.getResult();
  }
}


class MathScore extends Score { 
  MathScore (int score) {
    super("Math", score);     // super()    親クラスのコンストラクタを
  }

  @Override
  protected String getResult() {
    System.out.println("MathScore method");
    return this.score >= 50? "Pass" : "Fails";
  }
}


class EnglishScore extends Score {     // クラス名 extends 継承元クラス名
  EnglishScore (int score) {
    super("English", score);
  }

  @Override
  protected String getResult() {
    System.out.println("EnglishScore method");
    return this.score >= 70? "Pass" : "Fails";
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
    User user1 = new User("Taro", new MathScore(70));
    User user2 = new User("Jiro", new EnglishScore(80));

    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());
  }
}