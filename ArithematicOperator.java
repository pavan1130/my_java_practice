import java.util.Scanner;

class ArithematicOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum of two numbers:" + (a + b));
        System.out.println("sub of two numbers:" + (a - b));
        System.out.println("maltiplication of two numbers:" + (a * b));
        System.out.println("division of two numbers:" + (a / b));
    }
}