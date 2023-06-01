import java.util.Objects;

public class FizzBuzz {
    public static void main(String[] args) {

        if (args.length == 0) {
            return;
        }
        int max = Integer.parseInt(args[0]);

        for (int i = 0; i < max; i++) {
            int num = i + 1;
            String result = "";

            if (num % 3 == 0) {
                result = result + "Fizz";
            }

            if (num % 4 == 0) {
                result = result + "test";
            }
			if (num % 5 ==0) {
				result = result + "Buzz";
			}

            if (Objects.equals(result, "")) {
                System.out.print(num + " ");
            } else {
                System.out.print(result + " ");
            }
        }
    }
}
