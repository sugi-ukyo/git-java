public class ArgsLastPrinter {
  public static void main(String[] args) {

    int num = args.length;

    if (args.length == 0) {
      System.out.println("nashi") ;
    } else {
      System.out.println(args[num - 1]) ;
    }
  }
}