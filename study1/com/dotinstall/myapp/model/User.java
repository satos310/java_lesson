package com.dotinstall.myapp.model;

// staticキーワード　→　インスタンス化しなくてもクラスから直接使えるフィールドやメソッドを定義可
public class User {      // class名の1文字目は必ず大文字
  // protected String name = "Me!";      // classに属するnameを「フィールド」という, tom.nameに代入される
  private String name;
  private static int count = 0;   // classに紐づいた形で値を保存できる

  // constructor  クラスがインスタンス化される時に必ず呼ばれる特殊なメソッド　　メソッド==オーバーロード可
  public User(String name, int score) {
    this.name = name;     // メソッド内からクラスのフィールドにアクセスするには「this」を使用　今回は"Tom"が入る
    User.count++;
  }
  
  public static void getInfo() {
    System.out.println("# of instances: " + User.count);
  }

}