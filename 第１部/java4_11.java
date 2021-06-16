public class java4_11{
  public static void main(String[] args){
    int[] scores = {20, 30, 40, 50, 60, 80};
    int count = 0;
    for (int i = 0 ; i <scores.length; i++){
      if (scores[i] >= 50) {
        count++;
      }
    }
    System.out.println("５０点以上の科目の数は：" + count);
  }
}