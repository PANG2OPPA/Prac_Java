package 태초마을;

import java.util.Scanner;

public class x18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";

        for(Character c : a.toCharArray()) {
            if(Character.isUpperCase(c)){
                b += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                b += Character.toUpperCase(c);
            }
        }
        System.out.println(b);
    }
}
