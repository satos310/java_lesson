// Thread   コンピュータの処理単位のこと    複数立ち上げれば複数の処理を同時に実行可

// Runnable   インターフェースの一つ    ここからnew Thread()に処理を渡す
class MyRunnable implements Runnable {      // implements -> クラスを継承する時,  extends -> インターフェースを適合させる時
  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      System.out.print('*');     // printのみだと改行抜きで表示される   // "" → 文字列　'' → 文字
    }
  }
}

public class MyApp {
  
  public static void main(String[] args) {      // main()の処理もThread上で実行されている
    MyRunnable r = new MyRunnable();
    Thread t = new Thread(r);      // Threadクラスのインスタンスを作成
    t.start();      // startメソッドを呼び出す -> run()メソッドが実行される
    
    
    for (int i = 0; i < 500; i++) {
      System.out.print('.');     // printのみだと改行抜きで表示される   // "" → 文字列　'' → 文字
    }
  }
}