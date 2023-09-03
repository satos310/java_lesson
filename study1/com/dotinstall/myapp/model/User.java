package com.dotinstall.myapp.model;

public class User {      // class名の1文字目は必ず大文字
  protected String name = "Me!";      // classに属するnameを「フィールド」という, tom.nameに代入される

  // constructor  クラスがインスタンス化される時に必ず呼ばれる特殊なメソッド　　メソッド==オーバーロード可
  public User(String name) {
    this.name = name;     // メソッド内からクラスのフィールドにアクセスするには「this」を使用　今回は"Tom"が入る
  }

  // User() {      // 引数なしでインスタンス化されたとき
  //   // this.name = "Me!";      // Me!を代入する

  //   // this()
  //   this("Me!");      // 引数なしでインスタンス化した場合　→　引数が1つのUser(String name){...を呼んでくれる　→　this.nameにMe!が設定される
  // }

  public void sayHi() {      // メソッド
    System.out.println("hi! " + this.name);
  }
}