package 알고리즘6_0913;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        char target = 'Z';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.print(i + 1);
            }
        }

    }
}
