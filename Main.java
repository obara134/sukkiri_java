// ２章練習問題
// public class Main{
//   public static void main(String[] args){
//     System.out.println("ようこそ占いの館へ");
//     System.out.println("あなたの名前を入力して下さい");
//     String name = new java.util.Scanner(System.in).nextLine();
//     System.out.println("あなたの年齢を入力して下さい");
//     String ageString = new java.util.Scanner(System.in).nextLine();
//     int age = Integer.parseInt(ageString);
//     int fortune = new java.util.Random().nextInt(4);
//     fortune += 1;
//     System.out.println("占いの結果が出ました。");
//     System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");
//     System.out.println("1:大吉　2:中吉　3:吉　4:凶");
//   }
// }


// 　３章練習問題
// public class Main{
//   public static void main (String[] args){
//     int isHungry = new java.util.Random().nextInt(2);
//     String food = "うなぎ";
//     System.out.println("こんにちは");
//     if (isHungry == 0){
//       System.out.println("お腹がいっぱいです。");
//     }
//     else{
//       System.out.println("はらぺこです。");
//       System.out.println(food + "をいただきます。");
//       System.out.println("ごちそうさまでした");
//     }
//   }
// }
// public class Main{
//   public static void main(String [] args){
//     System.out.print("[メニュー]１：検索　２：登録　３：削除　４：変更");
//     int selected = new java.util.Scanner(System.in).nextInt();
//     switch (selected) {
//       case 1:
//         System.out.println("検索します");
//       break;

//       case 2:
//       System.out.println("t登録します");
//       break;

//       case 3:
//       System.out.println("削除します");
//       break;

//       case 4:
//       System.out.println("変更します");
//       break;
//       default:
//         break;
//     }
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     System.out.println("「数当てゲーム」");
//     int ans = new java.util.Random().nextInt(10);
//     for(int i=0; i < 5; i++){
//       System.out.println("0~9の数字を入力して下さい");
//       int num = new java.util.Scanner(System.in).nextInt();
//       if (num == ans){
//         System.out.println("当たり！");
//         break;
//       }
//       else if (num != ans){
//         System.out.println("違います");
//       }
//     }
//     System.out.println("終了します");
//   }
// }