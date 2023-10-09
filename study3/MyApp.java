// インターフェースを使う

// interface    抽象メソッドのような効果を、継承関係のない任意のクラスに対しても同じようなことをする
// ScoreクラスとUserクラスで、処理のログを取る(継承関係なし)
interface Loggable {      // interfaceの後の変数の名前... 「able」を後ろに付ける(...ができる), 頭文字は大文字
  void log();     // 抽象メソッドと同じく、実装の中身は価格なくてOK    // void   返り値なし
}


abstract class Score implements Loggable {      // impplemenmts 変数名 -> interfaceのメソッド実装可
  private String subject;
  protected int score;

  Score(String subject, int score) {
    this.subject = subject;
    this.score = score;
  }
  
  protected abstract String getResult();      // 抽象メソッド...実装がなく不完全 -> このクラス自体からはインスタンス作成不可

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


class User implements Loggable {
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