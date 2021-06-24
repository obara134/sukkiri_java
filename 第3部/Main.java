import java.util.Date;

public class Main{
  public static void main(String[] args){
    // コード１５−１
    // String s1 = "スッキリjava";
    // String s2 = "Java";
    // String s3 = "java";

    // if (s2.equals(s3)){
    //   System.out.println("s2とs3はひとしい");
    // }
    // if (s2.equalsIgnoreCase(s3)){
    //   System.out.println("s2とs3はケースを区別しなければ等しい");
    // }
    // System.out.println("s1の長さは" + s1.length() + "です");
    // if (s1.isEmpty()){
    //   System.out.println("s1は空文字です");
    // }

    // コード１５−２
    // String s1 = "Java and JavaScript";
    // if(s1.contains("Java")){
    //   System.out.println("文字列s1はJavaを含んでいます。");
    // }
    // if (s1.endsWith("Java")){
    //   System.out.println("文字列s1は末尾にJavaがあります");
    // }
    // System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    // System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

     // コード１５−３
    // String s1 = "Java programming";
    // System.out.println("文字列s1の４文字目以降は" + s1.substring(3));
    // System.out.println("文字列s1の4~8文字目は" + s1.substring(3, 8));

    // コード１５−４
    // StringBuilder sb = new StringBuilder();
    // for(int i = 0; i < 10000; i++){
    //   sb.append("Java");
    //   sb.append("Java");
    // }
    // String s = sb.toString();
    // System.out.println(s);

    // コード１５−１０
    // long start = System.currentTimeMillis();
    // long end = System.currentTimeMillis();
    // System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした。");

    Date now = new Date();
    System.out.println(now);
    System.out.println(now.getTime());
    Date past = new Date(1600705425827L);
    System.out.println(past);
  }
}