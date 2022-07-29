import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        String result = a > b ? a + "is greatest" : b + "is greatest";
        System.out.println(result);

    }
}