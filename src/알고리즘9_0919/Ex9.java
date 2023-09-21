package 알고리즘9_0919;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열을 입력: ");
        String input = sc.nextLine();

        String[] x = input.split(",");
        int size = x.length;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(x[i]);
        }

        System.out.print("이동할 횟수: ");
        int count = sc.nextInt();

        System.out.println("결과:");

        int index = (count * 2) % size;
            System.out.println(arr[index]);
    }
}