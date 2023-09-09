// Thread   コンピュータの処理単位のこと    複数立ち上げれば複数の処理を同時に実行可

// Runnable   インターフェースの一つ    ここからnew Thread()に処理を渡す
// class MyRunnable implements Runnable {     // 関数型インターフェース   抽象メソッドを一つだけ持つインターフェース -> 「ラムダ式」という記法に置き換え可
//   @Override
//   public void run() {
//     for (int i = 0; i < 500; i++) {
//       System.out.print('*');
//     }
//   }
// }

// ↑ 上記クラスは ↓ 下記のnew Threadメソッド内に移動

public class MyApp {
  
  public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    // Thread t = new Thread(r);
    // t.start();
    
    // ラムダ式
    // （引数） -> ｛処理｝   「ラムダ式の記法 == Runnableインターフェース -> run()メソッド」とコンパイラが推測するため、記述不要となる
    // new Thread(new Runnable() {     // 無名クラス   class名を省略可    // new Rannableには引数がなく処理がfor文のため、voidメソッドは不要
    //   @Override
    //   public void run() {
    //     for (int i = 0; i < 500; i++) {
    //       System.out.print('*');
    //     }
    //   }
    // }).start();     // インスタンス化後に呼び出している
    
    new Thread(() -> {      // ラムダ式の記法     new Threadの引数が{}の中身の処理という意味
      for (int i = 0; i < 500; i++) {
        System.out.print('*');
      }
    }).start();
    
    for (int i = 0; i < 500; i++) {
      System.out.print('.');
    }
  }
}

// Q.「インスタンス化」「インターフェース」「Runnnableインターフェース」「runメソッド」