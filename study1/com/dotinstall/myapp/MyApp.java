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

// orverload
// public static void sayHi() {
//   System.out.println("Hi! Nobody!");
// }
}
