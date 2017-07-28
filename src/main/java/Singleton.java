/**
 * Created by esokolyanskaya on 26/07/2017.
 */
public final class Singleton {
  private static Singleton instance;
  private static int value = 0;

  private Singleton() {}

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
      instance.value++;
    }
    return instance;
  }

  public static void main(String[] args) {
    for (int i=0; i<5; i++){
      getInstance().print();
    }
  }

  private static void print(){
    System.out.println(value);
  }
}
