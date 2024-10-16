import java.util.Scanner;
import java.util.Vector;


/*  Class for utility methods to make functionality smoother
 *
 *  readYesNo() - reads stdin and returns boolean depending if 
 *  yes or no was provided -  or any word starting with y or n
 *
 *  stdInScanner() - returns the scanner object for shared global use
 *  
 *  closeScanner() - closes the scanner when no more input to be read
 *
 * */
public class Util {

  private static final Scanner scanner = new Scanner(System.in);
  private static Vector<String> string_tracker = new Vector<String>();

  private Util(){}

  static boolean readYesNo() {
    char yn = scanner.nextLine().toLowerCase().charAt(0);

    return yn == 'y' ? true: false;
  }

  public static Scanner stdInScanner() {
    return scanner;
  }
  
  public static void closeScanner() {
    scanner.close();
  }

  public static boolean nameOkay(String name) {
    if (!string_tracker.contains(name)) {
      string_tracker.add(name);
      return true;
    }
    else {
      return false;
    }
  }


}
