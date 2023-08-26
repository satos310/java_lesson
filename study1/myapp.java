public class myapp {
  
  //　単行
  /*
    comment out　複数行
  */
  
  public static void main(String[] args) {
    System.out.println(55_555_555);     // 出力させる際に数字の羅列のみの場合、「_」は省略される（メリット：可読性向上）
    System.out.println(1.2e3);      // 数値の後に「e3」と記述 → 10の3乗するという意味　　　1.2 × 1000 == 1200
    
    // 変数
    // 型 変数名
    
    // 文字 → char
    char a = 'a';           // charの際は''（シングルクォーテーション）で囲む
    
    // 整数 → byte short int long（右に行けば行くほど長い整数値に対応可）
    int b = 10;             // 基本的にintでまかなえる
    long c = 5555555555L;   // longを称する際は終わりに大文字のLをつける
    // 浮動小数点数 float double
    double d = 23423.344;   // 基本doubleでまかなえる
    float e = 32.33F;       // longと同じように、数字の最後にFをつける
    
    // 論理値 → boolean
    boolean flag = true;    // boolean → trueかfalseがくる
    
    // 文字列 → String
    String msg;
    msg = "Hello Wo\nrld Again\t!";     // \n → 改行  \t → タブ
    System.out.println(msg);
    System.out.println("Taro said hi. \"hi\", he replied.");      // 文字列に "" を使用したい場合は、手前に \ を置くことで認識させられる
    
    // 文字列と変数の組み合わせ
    String fname = "Taro";
    String lname = "Yamada";
    System.out.println(String.format("I am %s %s.", fname, lname));     // 文字列をString.formatで囲む　→　文字列を埋め込みたい箇所を%sとする　→　文字列の""の直後に , 区切りで変数を入力
    
    // 演算
    // + - * / %
    // ++ --
    int f;
    f = 10 / 3;
    System.out.println(f);  // 3
    f = 10 % 3;
    System.out.println(f);  // 1
    
    int g = 5;
    g++;
    System.out.println(g);  // 6
    g--;
    System.out.println(g);  // 5
    
    int h = 5;
    // h = h + 12;   // 1.
    h += 12;      // 2.   1.と2.は同じ意味
    // h -= 12       // 引き算ver.
    System.out.println(h);
    
    // 変数を使って計算
    int price = 150;
    final double RATE = 1.1;      // finaleという定数をつけると、値の再代入ができなくなる。　　また、定数名はわかりやすいように大文字にする。
    System.out.println(price * 120 * RATE);
    System.out.println(price * 130 * RATE);
    System.out.println(price * 140 * RATE);
    
    price ++;
    // RATE = 1.08;     // RATEという定数に再代入しようとしてもエラーが起きる。
    System.out.println(price * 120 * RATE);
    System.out.println(price * 130 * RATE);
    System.out.println(price * 140 * RATE);
    
    // 文字の足し算も可
    String i;
    i = "hello " + "world";
    System.out.println(i);
    
    // データ型の変換（キャスト）
    double j = 52343.231;
    int k = (int)j;         // jの値を変換後の値にするために、()でデータ型を囲む。
    System.out.println(k);  // (int)をつけない → エラーメッセージ「精度が失われる」と出力される。
    
    int l = 10;
    double m = (double)l / 4;       // lの手前に(double)つける → 2.5
    System.out.println(m);          // lの手前に(double)つけない → 2.0　mはdoubleだが、計算式内のlはintのため、小数点以下が切り捨て計算される
    
    // if文
    // > >= < <= == !=
    // && || !
    int score = 95;
    if (score > 80) {
      System.out.println("Great!");
    } else if(score > 60) {
      System.out.println("Good!");
    } else {
      System.out.println("so so ... !");
    }
    
    String rslt = score > 80 ? "Great!" : "so so ... !";    // (条件式) ? (true のときの値) : (false のときの値)    // 三項演算子という。
    System.out.println(rslt);
    
    // switch文による条件分岐
    String signal = "green";
    switch (signal) {
      case "red":
        System.out.println("stop!");
        break;      // switch文と「break」はセット！　忘れずに記述する
      case "yellow":
        System.out.println("caution!!");
        break;
      case "blue":
      case "green":
        System.out.println("GO!");
        break;
      default:
        System.out.println("wrong signal!!");
        break;
    }
    
    // while文で繰り返し処理
    //0 - 9
    int n = 0;
    while (n < 10) {
      System.out.println(n);
      n++;      // ++や--を単項演算子と呼ぶ
    }
    
    // 配列の要素
    int[] scores = {70, 80, 90};
    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);
    scores[1] = 100;
    System.out.println(scores[1]);
    System.out.println(scores.length);      // 配列の要素数を調べたいときは変数の後に.lengthをつける
    
    // 配列の中に整数が入ったものを管理
    // int[] firstYearScores = {70, 90, 80};
    // int[] secondYearScores = {30, 40, 50};
    int[][] scores2 = {
      {70, 90, 80},   // scores2[0]
      {30, 40, 50}    // scores2[1]
    };
    System.out.println(scores2[1][2]);    // 0{ 1{}, 2{} }の配列の中で1{}の中身の、{0, 1, 2}の2（今回でいう50）を選択している
    
    // 変数を代入したときの挙動
    int[] points = {70, 90, 80};
    // int[] pointsBackup = points;     // 参照型のため、変数をコピー　→　90
    int[] pointsBackup = {70, 90, 80};    // 値自体をコピーしたい場合　→　100
    points[1] = 100;
    System.out.println(points[1]);    // 100
    System.out.println(pointsBackup[1]);    // 90?→100になる  why...参照型のため、元の変数pointsの値が変わるとpointsBackup内も変わる
    // 参照型の変数を他の変数に代入しても、値そのものをコピーするわけではない
    
    // while ループ処理
    // 0 - 9
    int o = 0;
    // while(o < 10) {
    //   System.out.println(o);
    //   o++;      // 単項演算子
    // }
    
    // do while　while文と同じ動作をする
    do {
      System.out.println(o);
      o++;      // 単項演算子
    } while(o < 10);      // 条件判定が後に来る → 順番として「表示→条件判定」のため、int 0の値が100でも1度は100と表示される
    
    // for　繰り返し処理
    // break　ループを抜ける
    // continue　それ以降の処理を実行せずに次のループに移る
    // 0 - 9
    for (int p = 0; p < 10; p++) {
      if (p == 5) {     
        // break;     // p=5の時にループから抜ける
        continue;     // p=5のを抜かして次の処理(6)を表示させる
      }
      System.out.println(p);
    }
    
    // 配列
    // 要素は全て0から始まる
    
    // int[] sales;     // 1. 2.
    
    // sales = new int[3];      // 1.   配列のデータ領域の確保をしている
    // sales[0] = 100;
    // sales[1] = 200;
    // sales[2] = 300;
    
    // sales = new int[] {100, 200, 300};     // 2.
    
    int[] sales = {100, 200, 300};        // 3.
    // 上記の1. 2. 3.は全て同じ処理を行っている　3.は1行でまとまるのでシンプル
    
    System.out.println(sales[1]);
    
    sales[1] = 1000;
    
    System.out.println(sales[1]);
  }
}
