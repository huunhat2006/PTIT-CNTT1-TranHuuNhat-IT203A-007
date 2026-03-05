import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong cho danh sach: ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap gia trị: ");
                int number = scanner.nextInt();
                list.add(number);
            }

        } else {
            System.out.println("Lỗi: Số lượng phần tử không hợp lệ.");
        }
//        tim max
        int max = list.get(0);
        for (int i = 1; i< list.size(); i++) {
            if ( max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Max: " + max);
//        sap xep theo thu tu tang dan
        for (int i = 0; i <list.size() - 1; i++) {
            for (int j = 0;j < list.size() -i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp =list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1,temp);
                }
            }
        }
        System.out.println("Sorted list: " + list);
//        tinh gia tri trung binh
        double avg = 0;
        int count = 0;
        for (int i = 0; i< list.size(); i++) {
            count += list.get(i);
        }
        avg = count / list.size() ;
        System.out.println("Average: " + avg);
//        dem so luong so chan, le
        int even = 0;
        int odd = 0;
        for (int i = 0; i< list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even++;
            } else  {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
