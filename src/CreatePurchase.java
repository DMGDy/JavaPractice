public class CreatePurchase{
    public static void main(String[] args) {

      Purchases purchases = new Purchases();

      do {
        purchases.addPurchase();

        System.out.printf("Continue entering invoices? [y/n] ");
      }while(Util.readYesNo());

      purchases.showPurchases();
      Util.closeScanner();

    }
}
