import java.util.Scanner;

class S {
    String name;

    public S(String name) {
        this.name = name;
    }
}

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = a;

        b = 10;

        System.out.println("Biến nguyên thủy");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        S s1 = new S("Huy");
        S s2 = s1;

        s2.name = "Tuấn";

        System.out.println("Biến tham chiếu");
        System.out.println("s1.name: "+s1.name);
        System.out.println("s2.name: "+s2.name);
    }
}
