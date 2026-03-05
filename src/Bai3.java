import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap chuoi: ");

        String string = scanner.nextLine();
        String newString = string.replace(" ", "").toLowerCase().trim();

        if (newString != "") {
            if (isValid(newString)) {
                System.out.println("Result: True");
            } else {
                System.out.println("Result: False");
            }
        } else {
            System.out.println("Lỗi: Chuỗi không hợp lệ");
        }

    }
    public static boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        for (char character : s.toCharArray()) {
            if (character == '(' ||character == '{' || character == '[') {
                stack.push(character);
            }
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((character==')'&&top != '(') ||
                        (character =='}' && top != '{') ||
                        (character == ']'&& top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
