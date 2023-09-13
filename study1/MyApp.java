// LocalDataTime

import java.time.*;     // LocalDataTimeを使用するためのjava.utilパッケージ
import java.time.format.DateTimeFormatter;     // 好きなフォーマッ（書式）トで出力する ≒ Excelのデータ書式をユーザー定義にするイメージ

public class MyApp {
  public static void main(String[] args) {
    LocalDateTime d = LocalDateTime.now();      // LocalDataTime...日時に関するクラス, タイムゾーンを考慮しない    // LocalDataTime.now()...現在時刻のインスタンスを取得
    // LocalDataTime d = LocalDataTime.of(2023, 9, 14, 7, 13, 30);     // 特定の日付の椅子タスがほしい場合（年, 月, 日, 時, 分, 秒）
    // LocalDataTime d = LocalDataTime.parase("2023-09-04T07:13:30");// 
    
    System.out.println(d.getYear());      // 2023   年のみを取得
    System.out.println(d.getMonth());     // SEPTEMBER    月のみを取得
    System.out.println(d.getMonth().getValue());    // 9    月を数字で取得
    
    System.out.println(d.plusMonths(2).minusDays(3));     // 日時計算   2ヶ月分足して、3日分引く
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");     // ""内の記号はたくさんある   「DateTimeFormatter」で検索
    System.out.println(d.format(dtf));      // dに対して.format()を渡す -> dtfを渡す -> 「yyyy!MM!dd!」の書式で出力
                                            // 日時クラスは変更不可（イミュータブル） -> 日時計算は度外視されている
  }
}
