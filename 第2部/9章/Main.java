public class Main{
  public static void main(String [] atgs){
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h1 = new Hero("ミナト");
    h1.sword = s;

    Hero h2 = new Hero("スガワラ");

    Hero test = new Hero();
    System.out.println(test.name);
    System.out.println(test.hp);
    Wizard w = new Wizard();
    w.name = "アサカ";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
    System.out.println("現在の武器は" + h1.sword.name);
    System.out.println(h1.name + "は、" + h1.sword.name + "で攻撃した。");
  }
}