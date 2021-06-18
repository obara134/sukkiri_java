public class PoizonMatango extends Matango{
  int poizonCount = 5;
  public PoizonMatango(char suffix){
    super(suffix);
  }
  public void attack(Hero h){
    super.attack(h);
    if (this.poizonCount > 0){
      System.out.println("さらに毒の胞子をばら撒いた!");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(h.name + "に" + dmg + "ポイントのダメージ！");
      this.poizonCount--;
    }
  }
}