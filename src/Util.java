import java.util.ArrayList;
import java.util.Scanner;


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
  private static ArrayList<String> string_tracker = new ArrayList<String>();

  private Util(){}

  static boolean readYesNo() {
    char yn = scanner.nextLine().toLowerCase().charAt(0);
    return yn == 'y';
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
