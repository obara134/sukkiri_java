public class java5_4{
  public static void main(String[] args){
    System.out.println("メソッドを呼び出します。");
    hello("奏");
    hello("明香");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました。");
  }
  public static void hello(String name){
    System.out.println(name + "さん、こんにちは");
  }
}