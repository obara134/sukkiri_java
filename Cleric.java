public class Cleric {
  String name = "oba";
  int HP = 50;
  final int Max_Hp = 50;
  int MP = 10;
  final Max_Hp = 10;

  public void selfAid(){
    System.out.println("聖職者はセルフエイドを唱えた！");
    this.MP -= 5;
    this.HP = Max_Hp;
    System.out.println("聖職者はHPが最大まで回復した!");
  }
  public int pray(int sec){
    System.out.println("聖職者は祈った！");
    int random_point = new java.util.Randome(System.in)nextInt(3) + sec;
    System.out.println("聖職者は" + )   
  }
}