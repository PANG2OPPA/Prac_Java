package 알고리즘7_0715;

import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 입력: ");
        String input = sc.nextLine();
        String[] numArray = input.split(",");

        int[] array = new int[numArray.length];

        for (int i = 0; i < numArray.length; i++) {
            array[i] = Integer.parseInt(numArray[i].trim());
        }

        int count = countSevens(array);

        System.out.println("7의 개수는: " + count);
    }

    public static int countSevens(int[] array) {
        int count = 0;

        for (int num : array) {
            String strNum = String.valueOf(num);
            for (int i = 0; i < strNum.length(); i++) {
                if (strNum.charAt(i) == '7') {
                    count++;
                }
            }

        }

        return count;
    }
}