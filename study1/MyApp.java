/*
Wrapper Class   基本データ型に対応する参照型クラス
int -> Integer
double -> Double
*/


public class MyApp {
  
  public static void main(String[] args) {
    // Integer i = new Integer(32);      // Integerのラッパークラス型で i を宣言
    // int n = i.intValue();     // ラッパークラスの値を基本データ型として取り出す
    
    Integer i = 32;     // auto boxing    自動変換を参照型に入れる
    i = null;     // 参照型のデータには値そのものではなく、値が入っているメモリ領域の場所が入る -> どの場所も指示していない状態(null)
    int n = i;      // auto unboxing    iはnullのため、unboxingできない
    System.out.println();
  }

}