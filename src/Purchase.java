import java.util.Vector;

public class Purchase {

  private Vector<String> items = new Vector<String>();
  private int invoice_number;
  private double sale_amount;
  private double sales_tax = 1.06;

  Purchase() { }

  public int addItems(String name) {
    if (!Util.nameOkay(name)) {
      System.out.println("Enter a unique item name!");
      return -1;
    }
    this.items.add(name); 
    return 0;
  }

  public int setInvoiceNumber(int number) {
    if((number < 1000) || (number >= 8000)) {
      System.out.println("Enter a valid number between [1000,8000)");
      return -1;
    }
    this.invoice_number = number;
    return 0;
  }

  public int calculateSalesAmount(double sale) {
    if(sale < 0.0) {
      System.out.println("Enter a valid positive number as the sales amount");
      return -1;
    }
    this.sale_amount = sale * this.sales_tax;
    return 0;
  }

  public void showPurchase() {
    System.out.println("-----------------------------------------------");
    System.out.printf("Displaying Purchase information for invoice %d:\n"
        ,this.invoice_number);

    if(this.items.capacity() > 1) {

      System.out.println("\tItems:");

      for(String item: this.items) {
        System.out.printf("\t\t%s\n",item);
      }

    }
    else {
      System.out.printf("\tItem:\n\t\t%s\n",this.items.firstElement());
    }

    System.out.printf("\tSale amount:\n\t\t%,.2f\n",this.sale_amount);
    System.out.println("-----------------------------------------------");
  }


}
