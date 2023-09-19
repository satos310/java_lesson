// while文で反復処理をする
// 繰り返し回数が予あらかじめ決まっていない、分かりにくい場合に使用する

import java.util.Scanner;

// 500円のお金を1年毎に10％ずつ増えて言った場合の条件・反復処理
public class MyApp {
  public static void main(String[] args) {
    double money = 500;
    while (money < 1000.0) {      // moneyが１０００円を超えるまで反復処理を実行
      money *= 1.1;
      System.out. println(money);
    }
  }
}
