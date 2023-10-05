// インスタンスの情報を表示してみる
// クラスごとに「Scoreに関する実装」「Userに関する実装」を分ける -> 機能拡張時に修正しやすい

// MyAppクラス内のインスタンスに設定された情報を表示する
class Score {
  private String subject;
  private int score;
  
  Score(String subject, int score) {
    this.subject = subject;
    this.score = score;     // 宣言の理由を復習要
  }
  
  String getScoreString() {     // 3. private外でsubject, scoreのデータを引数にするメソッドを定義
    return this.subject + ", " + this.score;
  }
}

class User {
  private String name;
  private Score score;
  User(String name, Score score) {
    this.name = name;
    this.score = score;
  }
  
  String getString() {
    // return this.name + ", " + this.score.subject;      // 1. 文字列を返したい but scoreとsubjectはScoreクラスでprivateに設定されている
    return this.name + ", " + this.getScoreString();      // 2. getScoreString()というメソッドを実行し、結果を連結する
  }
}

public class MyApp {
  public static void main(String[] args) {
    User user1 = new User("Taro", new Score("Math", 70));     // Scoreクラスでは科目と点数を保持したい -> 数学, 70と明記
    User user2 = new User("Jiro", new Score("English", 80));
    
    System.out.println(user1.getString());
    System.out.println(user2.getString());
  }
}