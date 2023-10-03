// Scoreクラスを定義する

// 点数に科目の内容も含める -> Scoreというデータ型を作りプログラムを拡張する
class Score {
  private String subject;
  private int score;
  
  Score(String subject, int score) {
    this.subject = subject;
    this.score = score;     // 宣言の理由を復習要
    
  }
}

class User {
  private String name;
  private Score score;      // Q. ここも
  // A. new Score()でStringとintを一塊で扱っているため、変数のような箱で一括にデータを送り返ししている
  User(String name, Score score) {      // Q. なぜUserクラスのコンストラクタに渡すsocoreの値がintからScoreになるのか？
    this.name = name;
    this.score = score;
  }
}

public class MyApp {
  public static void main(String[] args) {
    // 点数 + 科目の内容を含める -> データ型(Score)を作ってプログラムを拡張する
    User user1 = new User("Taro", new Score("Math", 70));     // Scoreクラスでは科目と点数を保持したい -> 数学, 70と明記
    User user2 = new User("Jiro", new Score("English", 80));

  }
}