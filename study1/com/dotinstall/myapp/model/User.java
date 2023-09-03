package com.dotinstall.myapp.model;

public class User {      // class名の1文字目は必ず大文字
  // protected String name = "Me!";      // classに属するnameを「フィールド」という, tom.nameに代入される
  private String name;
  private int score;

  // constructor  クラスがインスタンス化される時に必ず呼ばれる特殊なメソッド　　メソッド==オーバーロード可
  public User(String name, int score) {
    this.name = name;     // メソッド内からクラスのフィールドにアクセスするには「this」を使用　今回は"Tom"が入る
    this.score = score;
  }
  
  public int getScore() {     // getter
    return this.score;
  }
  
  public void setScore(int score) {     // setter
    if (score > 0) {
      this.score = score;
    }
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