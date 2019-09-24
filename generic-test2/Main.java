class ClassSample<T> {
  private T t;

  public ClassSample(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }
}

public class Main {
  public static void main(String[] args) {
    ClassSample<Integer> cs2 = new ClassSample<>(100);
    Integer i = cs2.getT();
    System.out.println(i);

    ClassSample<? extends Number> cs3;
    cs3 = cs2;
    Number n = cs3.getT();
    System.out.println(n);
  }
}
