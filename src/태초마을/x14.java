package 태초마을;

import java.util.Scanner;

public class x14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x <= 100 && x >= 90){
            System.out.println("A");
        }
        else if (x <= 89 && x >= 80){
            System.out.println("B");
        }
        else if (x <= 69 && x >= 60){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }
}
