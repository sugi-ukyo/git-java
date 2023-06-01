public class AArgsLastPrinter {
    public static void main(String[] args) {

        int num = args.length;

        if (num == 0) {
            System.out.println("nashi");
        } else {
            System.out.println(args[num - 1]);
        }
    }
}