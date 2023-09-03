

// staticキーワード　→　インスタンス化しなくてもクラスから直接使えるフィールドやメソッドを定義可
class User {      // class名の1文字目は必ず大文字
  // protected String name = "Me!";      // classに属するnameを「フィールド」という, tom.nameに代入される
  private String name;
  private static int count = 0;   // 「クラス変数」　staticをつける → フィールドやメソッドをclassに紐づいた形で値を保存できる

  // constructor  クラスがインスタンス化される時に必ず呼ばれる特殊なメソッド　　メソッド==オーバーロード可
  public User(String name) {
    this.name = name;     // メソッド内からクラスのフィールドにアクセスするには「this」を使用　今回は"Tom"が入る
    User.count++;
  }

  public static void getInfo() {      // 「クラスメソッド」  static
    System.out.println("# of instances: " + User.count);
  }

}

public class MyApp {
  public static void main(String[] args) {      // ずっとmainにもstaticがついていて、クラスメソッドになっている
    User.getInfo();     // 0                       why... Javaの仮想マシンがMyAppのインスタンスを作らずに実行できるように
    User tom = new User("tom");
    User.getInfo();     // 1
    User bob = new User("bob");
    User.getInfo();     // 2
  }

}
