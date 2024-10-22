import java.util.InputMismatchException;
import java.util.Vector;

public class Purchases {

private Vector<Purchase> purchases; 

  Purchases() {
    this.purchases = new Vector<Purchase>();
  }

  void addPurchases() {
    Purchase p = new Purchase();

    do {
      do{
        do {
          System.out.printf("Enter item name: ");

        } while(p.addItems(Util.stdInScanner().nextLine()) < 0);

        System.out.printf("Add items to invoice? [y/n] ");

      }while(Util.readYesNo());


      boolean valid_invoice= false;
      
      while(!valid_invoice) {
        try {
          System.out.printf("Enter invoice number: ");
          while(p.setInvoiceNumber(Util.stdInScanner().nextInt()) < 0){}
          valid_invoice = true;
        } catch(InputMismatchException e) {
          System.out.println("Enter a valid number between [1000,8000)");
          Util.stdInScanner().nextLine();
        }
      }

      boolean valid_amount = false;

      while(!valid_amount) {
        try {
          System.out.printf("Enter sale amount: ");
          while(p.calculateSalesAmount(Util.stdInScanner().nextDouble()) < 0){}
          Util.stdInScanner().nextLine();
          valid_amount = true;
        }catch(InputMismatchException e) {
          System.out.println("Enter a valid positive number as the sales amount");
          Util.stdInScanner().nextLine();
        }
      }

      this.purchases.add(p);
      System.out.printf("Continue entering invoices? [y/n] ");
    }while(Util.readYesNo());

    Util.closeScanner();
  }

  void showPurchases() {
    System.out.println("===============================================");
    System.out.println("==============Showing all invoices=============");
    for(Purchase p: purchases) {
      p.showPurchase();
    }
    System.out.println("===============================================");
  }

}
