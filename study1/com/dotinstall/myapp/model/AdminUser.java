package com.dotinstall.myapp.model;

public class AdminUser extends User {      // extendsを使用することでその後に書いたclassを継承する

  public AdminUser(String name) {
    super(name);      // 親クラスのコンストラクタ　　※親クラスのコンスタラクタに引数が開ければ省略可
  }

  public void sayHello() {      // メソッド
    System.out.println("hello! " + this.name);
  }

  // override   親クラスのメソッドを上書きすることができる
  @Override     // 「アノテーション」という仕組みを使ってスペルミスや引数間違い時にエラーにしてくれる
  public void sayHi() {      // メソッド
    System.out.println("[admin] hi! " + this.name);
  }

  // private protected public site:docs.oracle.com
}