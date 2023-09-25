// メソッドで処理をまとめてみる
// コードの重複を減らせる

// 
public class MyApp {
  private static void showAd() {      // 実引数なし -> 仮引数も空()でOK
    System.out.println("---------");
    System.out.println("SALE! 50% OFF!");
    System.out.println("---------");
  }
  
  private static void showContent() {
    System.out.println("BREAKING NEWS!");
    System.out.println("Two baby pandas born at our Zoo!");
  }
  
  public static void main(String[] args) {
    showAd();
    showContent();
    showAd();     // メソッドを呼び出すだけでshowAdの中身をもう一度記述せずに済む
  }
}