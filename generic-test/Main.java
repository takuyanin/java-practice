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
    // as String type
    ClassSample<String> cs1 = new ClassSample<String>("Hello");
    String str = cs1.getT();
    System.out.println(str);

    // as Integer type
    ClassSample<Integer> cs2 = new ClassSample<Integer>(100);
    Integer i = cs2.getT();
    System.out.println(i);
  }
}
