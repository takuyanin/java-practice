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
    ClassSample<Number> cs4 = new ClassSample<>(100);
    ClassSample<? super Integer> cs5;
    cs5 = cs4;
    Object o = cs5.getT();
    System.out.println(o);
  }
}
