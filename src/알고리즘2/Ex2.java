package 알고리즘2;

import java.util.Scanner;

import static java.lang.System.in;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("다항식을 입력하세요 : ");
        String str = scanner.nextLine();
        String [] terms = str.split("\\+");
        int sum = 0;

        for(String term : terms) {
            String equationStr = term.split("x")[0].trim();

            if (!equationStr.isEmpty()) {
                int equation = Integer.parseInt(equationStr);
                sum += equation;
            }
        }
        System.out.println(sum + "x");
    }
}
