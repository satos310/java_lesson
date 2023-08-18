public class myapp {
  
  // 
  /*
    comment out
  */
  
  public static void main(String[] args) {
    // 変数
    // 型 変数名
    
    // 文字 → char
    char a = 'a';           // charの際は''（シングルクォーテーション）で囲む
    
    // 整数 → byte short int long（右に行けば行くほど長い整数値に対応可）
    int b = 10;             // 基本的にintでまかなえる
    long c = 5555555555L;   // longを称する際は終わりに大文字のLをつける
    // 浮動小数点数 float double
    double d = 23423.344;   // 基本doubleでまかなえる
    float e = 32.33F;       // longと同じように、数字の最後にFをつける
    
    // 論理値 → boolean
    boolean flag = true;    // boolean → trueかfalseがくる
    
    // 文字列 → String
    // \n → 改行
    // \t → タブ
    String msg;
    msg = "Hello Wo\nrld Again\t!";
    
    System.out.println(msg);
    
    // 演算
    // + - * / %
    // ++ --
    int f;
    f = 10 / 3;
    System.out.println(f);  // 3
    f = 10 % 3;
    System.out.println(f);  // 1
    
    int g = 5;
    g++;
    System.out.println(g);  // 6
    g--;
    System.out.println(g);  // 5
    
    int h = 5;
    h = h + 12;   // 1.
    h += 12;      // 2.   1.と2.は同じ意味
    System.out.println(h);
    
    String i;
    i = "hello " + "world";
    System.out.println(i);
    
    // データ型の変換（キャスト）
    double j = 52343.231;
    int k = (int)j;         // jの値を変換後の値にするために、()でデータ型を囲む
    System.out.println(k);  // (int)をつけない → エラーメッセージ「精度が失われる」と出力される。
    
    int l = 10;
    double m = (double)l / 4;       // lの手前に(double)つける → 2.5
    System.out.println(m);          // lの手前に(double)つけない → 2.0　mはdoubleだが、計算式内のlはintのため、小数点以下が切り捨て計算される
    
    // if文
    // > >= < <= == !=
    // && || !
    int score = 95;
    if (score > 80) {
      System.out.println("Great!");
    } else if(score > 60) {
      System.out.println("Good!");
    } else {
      System.out.println("so so ... !");
    }
    
    String rslt = score > 80 ? "Great!" : "so so ... !";    // (条件式) ? (true のときの値) : (false のときの値)    // 三項演算子という。
    System.out.println(rslt);
    
    // switch文による条件分岐
    String signal = "green";
    switch (signal) {
      case "red":
        System.out.println("stop!");
        break;      // switch文と「break」はセット！　忘れずに記述する
      case "yellow":
        System.out.println("caution!!");
        break;
      case "blue":
      case "green":
        System.out.println("GO!");
        break;
      default:
        System.out.println("wrong signal!!");
        break;
    }
  }
  
}