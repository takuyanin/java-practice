public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  @Override
  public void speak() {
    System.out.println("私の名前は" + name + "だワン!");
  }

  @Override
  public void eat() {
    System.out.println("ガブガブガブ");
  }
}
