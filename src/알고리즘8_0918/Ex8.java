package 알고리즘8_0918;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int x = findSmallestX(arr);
        System.out.println("가장 작은 x 값: " + x);
    }

    public static int findSmallestX(int[] arr) {
        while (true) {
            int[] nextArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) { // 크거나 같은 짝수
                    nextArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) { // 작은 홀수
                    nextArr[i] = (arr[i] * 2) +1;
                } else { // 나머지는 그대로 유지
                    nextArr[i] = arr[i];
                }
            }

            if (Arrays.equals(arr, nextArr)) {
                return Arrays.stream(arr).min().getAsInt();
            }

            arr = nextArr.clone();
        }
    }
}
