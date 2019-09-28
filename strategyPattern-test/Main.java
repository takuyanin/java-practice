public class Main {
    public static void main(String... args) {
        MyClass myClass = new MyClass(new HeightComparator());
        Human h1 = new Human("Bob", 173, 65, 36);
        Human h2 = new Human("Tommy", 166, 77, 32);
        System.out.println(myClass.compare(h1, h2));
    }
}
