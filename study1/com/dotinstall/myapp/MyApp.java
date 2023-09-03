package com.install.myapp;      // それぞれのクラスをパッケージに含める
import com.dotinstall.myapp.model.User;     // 最初にimportすることで関連付けを明示
import com.dotinstall.myapp.model.AdminUser;
// import com.dotinstall.myapp.model.*;     // myappの下にあるディレクトリをすべて読み込みたい時に * を使用可

public class MyApp {
  public static void main(String[] args) {
    User tom = new User("tom");     // newで新しい番地確保→ 「インスタンス化」, この状況ではtomのことを「インスタンス」と呼ぶ
    // System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");     // 引数なしで呼ぶ　→　Me!が入る,  クラスの宣言とインスタンス化は1行で書くことができる
    // System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }

  // メソッド
  // public static void sayHi(String name) {     // ここでsayHi()内に変数を宣言 → 上の記述で呼び出す時にsayHi()と記述すれば、任意の値を渡せる
    // System.out.println("Hi!");
    // System.out.println("Hi! " + name);

  // メソッドの値を返してもらいたい時 → 「return 返したい値」
  // public static String sayHi(String name) {     //  メソッドが値を返す時は、メソッド名の前に返すデータ型を書く必要有（※void → 「何も返さない」）
  //   return "Hi! " + name;     // 引数　個数や方が違えば、同じ名前でいくつでも作ることができる（メソッドのオーバーロード）
  // }

// orverload
// public static void sayHi() {
//   System.out.println("Hi! Nobody!");
// }
}