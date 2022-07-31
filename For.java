import java.util.Scanner;

class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0) {

            for (int i = 1; i < 11; i++) {

                System.out.println(num + "*" + i + "=" + num * i);

            }
        } else {
            for (int i = 10; i >= 1; i--) {
                System.out.println(num + "*" + i + "=" + num * i);

            }
        }
    }
}