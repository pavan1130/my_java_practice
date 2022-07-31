import java.util.Scanner;

class Forloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " *" + i + "=" + num * i);
        }

    }
}