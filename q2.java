import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();
        double bonus;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        } else {
            bonus = 0;
        }

        System.out.println("Bonus amount: " + bonus);

        sc.close();
    }
}
