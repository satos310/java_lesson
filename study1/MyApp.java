// Stringクラス

public class MyApp {

  public static void main(String[] args) {
    String s = "abcdef";
    System.out.println(s.length());     // length ... 文字数を返す -> 6
    System.out.println(s.substring(2, 5));     // substrings ... 0番目から数えた範囲の文字列を指す -> 2番目から5文字目まで -> cde
    System.out.println(s.replaceAll("ab", "AB"));     // replaceAll ... 文字列の置換 -> abがABになる
    
    String s1 = "ab";
    String s2 = "ab";
    
    if (s1.equals(s2)) {      // equals ... s1とs2を比較する
      System.out.println("same!");
    }
    
    if (s1 == s2) {     // 参照型データのため、メモリのどこに格納されているかの場所を比較する -> 中身を比較するため、same!same!が出力される
      System.out.println("same!same!");
    }
    
    String ss1 = new String("sb");      // new Stringと明示敵意メモリ領域をとっているため、メモリの格納場所がss1とss2は違う場所になる
    String ss2 = new String("sb");      //  -> if文がnoになるため、System.out.printlnは実行されない
    
    if (ss1 == ss2) {
      System.out.println("same!same!same!");
    }
  }
}
