// 点数に応じた結果を表示する

// 点数に応じてPassかFailかの文字列を連けるしていきたい
class Score {
  private String subject;
  private int score;
  
  Score(String subject, int score) {
    this.subject = subject;
    this.score = score;
  }
  
  // 合否の表示処理   // 条件演算子を使用(if文でもイケる)
  private String getResult() {      // このメソッドは内部処理用 -> Scoreクラス内でしか使えないようにしたい -> private
    return this.score >= 80? "Pass" : "Fails";
  }
  
  // ここに合否処理を書いてもいいが、コードの1文が長くなる -> getResultメソッドを作成して別途処理する
  String getScoreString() {
    return this.subject + ", " + this.score + ", " +this.getResult();
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
    User user1 = new User("Taro", new Score("Math", 70));
    User user2 = new User("Jiro", new Score("English", 80));
    
    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());
  }
}