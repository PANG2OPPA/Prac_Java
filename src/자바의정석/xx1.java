package 자바의정석;

public class xx1 {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Clover";
        c1.number = 1;
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 1;
        System.out.println(c1.kind + " " + c1.number + c1.width + c1.height);
        System.out.println(c2.kind + " " + c2.number + c1.width + c1.height);
        c1.width = 380;
        Card.height = 200;
        System.out.println(c1.kind + " " + c1.number + c1.width + c1.height);
        System.out.println(c2.kind + " " + c2.number + c2.width + c2.height);
    }


}

class Card {
    String kind;
    int number;
    int width = 100;
    static int height = 250;
}
