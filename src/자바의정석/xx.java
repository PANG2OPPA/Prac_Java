package 자바의정석;

public class xx {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7;
        System.out.println("변경완료");

        System.out.println(t1.channel);
        System.out.println(t2.channel);


    }
}
