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
    double m = l / 4;       // 
    System.out.println(m);
  }
  
}