package JavaAdvanced.z_Practice.StacksQueues;
import java.util.ArrayDeque;
import java.util.Scanner;
public class P03_01_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (number == 0) {
            System.out.println(0);
        } else {
            while (number > 0) {
                int bit = number % 2;
                stack.push(bit);
                number = number / 2;
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        }
    }
}