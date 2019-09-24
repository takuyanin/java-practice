public class Main {
  public static void main(String[] args) {
    String str = getT("Hello");
    System.out.println(str);

    Integer i = getT(100);
    System.out.println(i);
  }

  private static <T> T getT(T t) {
    return t;
  }
}
