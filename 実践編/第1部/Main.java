public class Main {
  public static void main(String [] args){
    // Hero h = new Hero();
    // h.name = "ミナト";
    // h.hp = 100;

    int n = 0;
    while(n <= 29){
      n++;
    

      

    if (n % 15 == 0){
      System.out.println("fizz_buzz");
    }
    else if (n % 3 == 0){
      System.out.println("fizz");
    }
    else if (n % 5 == 0){
      System.out.println("buzz");
    }
    else{
      System.out.println(n);
    }
  }
}
}

