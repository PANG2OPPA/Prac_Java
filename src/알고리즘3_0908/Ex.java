package 알고리즘3_0908;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        System.out.print("영문 입력: ");
        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("zero", 0);
        colorMap.put("one", 1);
        colorMap.put("two", 2);
        colorMap.put("three", 3);
        colorMap.put("four", 4);
        colorMap.put("five", 5);
        colorMap.put("six", 6);
        colorMap.put("seven", 7);
        colorMap.put("eigth", 8);
        colorMap.put("nine", 9);

        Scanner sc = new Scanner(System.in);
        String fval = sc.nextLine();

        StringBuilder numberBuilder = new StringBuilder();

        int startIndex = 0;
        int endIndex = fval.length();

        while (startIndex < endIndex) {
            boolean foundNumber = false;

            for (int i = endIndex; i > startIndex; i--) {
                String word = fval.substring(startIndex, i);
                Integer number = colorMap.get(word);

                if (number != null) {
                    numberBuilder.append(number);
                    startIndex += word.length();
                    foundNumber = true;
                    break;
                }
            }

            if (!foundNumber) {
                break;
            }
        }

        if (numberBuilder.length() > 0) {
            long result = Long.parseLong(numberBuilder.toString());
            System.out.println("출력 결과: " + result);
        } else {
            System.out.println("숫자 값이 없습니다.");
        }
    }
}