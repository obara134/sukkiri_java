public class Hero{
  String name;
  int hp;
  static int money;

  public static void setRandomMoney(){
    Hero.money = (int)(Math.random() * 1000);
  }

  public boolean equals (Object o){
    if (this == o){
      return true;
    }
    if (o instanceof Hero){
      Hero h = (Hero)o;ううr
      if(this.name.equals(h.name)){
        return true;
      }
    }
    return false;
  }

  public String toString(){
    return "名前：" + this.name + "/HP:" +this.hp;
  }
}