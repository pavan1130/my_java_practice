import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}