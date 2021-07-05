// ３章練習問題
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

public class Main{
  public static void main (String[] args){
    int isHungry = new java.util.Random().nextInt(2);
    String food = "うなぎ";
    System.out.println("こんにちは");
    if (isHungry == 0){
      System.out.println("お腹がいっぱいです。");
    }
    else{
      System.out.println("はらぺこです。");
      System.out.println(food + "をいただきます。");
      System.out.println("ごちそうさまでした");
    }
  }
}