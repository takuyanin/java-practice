public class Staff {
  public static void main(String[] arg) {
    Cashier cash = new Cash();
    Cashier credit = new CreditCard();

    System.out.println("***現金対応***");
    cash.bill();

    System.out.println("***クレジット対応***");
    credit.bill();
  }
}
