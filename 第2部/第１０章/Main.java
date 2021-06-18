public class Main {
  public static void main (String[] args){
    Hero h = new Hero();
    h.run();
    System.out.println(h.hp);
    SuperHero sh = new SuperHero();
    sh.run();
    Matango mm = new Matango('A');
    mm.attack(h);
    PoizonMatango pm = new PoizonMatango('B');
    pm.attack(h);
    System.out.println(h.hp);
    System.out.println(sh.hp);
  }
}