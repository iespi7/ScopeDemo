public class ScopeDemo {

    private static int x = 1;
    private float y = 1.0f;

    static {
      x = 2;
    }

  {
    float y = -1f;
  }

  public static void main(String[] args) {
      ScopeDemo sd = new ScopeDemo();
    for (int x = 0; x < 10; x++) {
      float y = x * x;
    }
    for (int x = -1; x >= -10; x *= 2) {

    }
    System.out.println("x = " + x + "; y = " + sd.y);
  }

}
