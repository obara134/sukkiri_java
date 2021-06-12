public class java5_p{
  // 練習問題5-1
  // public static void introduceOnself() {
  //   String name = "小原";
  //   int age = 25;
  //   double height = 169.6;
  //   String juunisi = "猪";
  //   System.out.println(
  //     name + "です" + age + "です" +
  //     "身長は" + height + "です" +
  //     juunisi + "です"
  //   );
  // }
  // public static void main(String[] args){
  //   introduceOnself();
  // }
  
  // 練習問題５−２、５ー３
  // public static void main(String[] args){
  //   String title = "お誘い";
  //   String address = "uuu@ppp";
  //   String text = "今度、飲みに行きませんか";
  //   email(address, text);
  // }
  // public static void email(String address, String text){
  //   System.out.println(address + "に以下のメールを送信しました。");
  //   System.out.println("件名：無題");
  //   System.out.println("本文：" + text);
  // }
  // public static void email(String title, String address, String text){
  //   System.out.println(address + "に、以下のメールを送信しました");
  //   System.out.println("件名：" + title);
  //   System.out.println("本文：" + text);
  // }

  // 練習問題５−４
  public static void main(String[] args){
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積は" + triangleArea + "cm2です" );
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積は" + circleArea + "cm2です");
  }
  public static double calcTriangleArea(double bottom, double height){
    double ans = (bottom * height) / 2 ;
    return ans;
  }
  public static double calcCircleArea(double radius){
    double ans = (radius * radius * 3.14);
    return ans;
  }
}