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
    int x = 10;             // 基本的にintでまかなえる
    long y = 5555555555L;   // longを称する際は終わりに大文字のLをつける
    // 浮動小数点数 float double
    double d = 23423.344;   // 基本doubleでまかなえる
    float f = 32.33F;       // longと同じように、数字の最後にFをつける
    
    // 論理値 → boolean
    boolean flag = true;    // boolean → trueかfalseがくる
    
    // 文字列 → String
    // \n → 改行
    // \t → タブ
    String msg;
    msg = "Hello Wo\nrld Again\t!";
    
    System.out.println(msg);
  }
  
}