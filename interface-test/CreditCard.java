public class CreditCard implements Cashier {
  @Override
  public void bill() {
    System.out.println("クレジットカードでお会計いたします。");
  }
}
