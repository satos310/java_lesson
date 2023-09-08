// generics   汎用化されたデータ型でクラスやインターフェースを作ることができる

// class MyInteger {
//   public void getThree(int x) {
//     System.out.println(x);
//     System.out.println(x);
//     System.out.println(x);
//   }
// }

// 上記と同じようなことをDoubleでもStringでもできるように型を汎用化させる

class MyData<T> {     // <>内に汎用化する方をどう表現するか書く     // T -> Typeという意味で使われる
  public void getThree(T x) {     // (int x)を(T x)へ変更
    System.out.println(x);
    System.out.println(x);
    System.out.println(x);
  }
}

public class MyApp {
  
  public static void main(String[] args) {
    // MyInteger mi = new MyInteger();
    // mi.getThree(55);
  
    MyData<Integer> i = new MyData<>();     // <Integer>の<>内に入るのは参照型のみ -> int等は不可     // 右辺の変数MyDataの後にも<>をつける
    i.getThree(32);     // Integer型でMyDataメソッドが使える
    MyData<String> s = new MyData<>();
    s.getThree("hello");      // String型でMyDataメソッドが
  }

}