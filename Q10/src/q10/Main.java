package q10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack<String> stack = new MyStack<String>();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter string " + i + ": ");
            stack.push(input.nextLine());
        }
        System.out.println("Strings in reverse order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        input.close();
    }
}
