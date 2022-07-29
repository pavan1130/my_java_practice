import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        sc.close();
        int c = a + b;
        System.out.println("add=" + c);
    }
}
