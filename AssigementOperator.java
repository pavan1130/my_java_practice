import java.util.Scanner;

class AssigementOperator {
    public static void main(String[] p) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        a += 10;
        System.out.println(a);
        a -= 4;
        System.out.println(a);
        b += 10;

        System.out.println(b);
        c -= 30;

        System.out.println(c);
        d += a;
        System.out.println(d);
    }
}