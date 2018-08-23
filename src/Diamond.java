public class Diamond implements InterfaceA, InterfaceB {

  @Override
  public void doSomething() {
    InterfaceB.super.doSomething();
  }

  public static void main(String[] args) {
    new Diamond().doSomething();
  }
}
