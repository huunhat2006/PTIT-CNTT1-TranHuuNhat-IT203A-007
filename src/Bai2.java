import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap chuoi: ");

        String string = scanner.nextLine();
        String newString = string.replace(" ", "").toLowerCase().trim();

        if (newString != "") {
            Map<Character, Integer> map =new TreeMap<>();

            for (int i = 0; i <newString.length(); i++) {
                char character =newString.charAt(i);
                if (map.containsKey(character)) {
                    map.put(character,map.get(character) + 1);
                } else {
                    map.put(character,1);
                }
            }
            for (Map.Entry<Character, Integer> entry :map.entrySet()) {
                System.out.println(entry.getKey() + " số lần xuất hiện: " + entry.getValue());
            }
        } else {
            System.out.println("Lỗi: Chuỗi không hợp lệ");
        }


    }
}
