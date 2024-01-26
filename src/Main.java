import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b, atk, atk2, def, def2, lv, lv2, f, f2;

        while (a != 0) {
            a--;

            b = sc.nextInt();
            atk = sc.nextInt();
            def = sc.nextInt();
            lv = sc.nextInt();

            atk2 = sc.nextInt();
            def2 = sc.nextInt();
            lv2 = sc.nextInt();

            f = (atk + def) / 2;
            if (lv % 2 == 0) {
                f = f + b;
            }

            f2 = (atk2 + def2) / 2;
            if (lv2 % 2 == 0) {
                f2 = f2 + b;
            }

            if (f > f2) {
                System.out.println("Dabriel");
            } else if (f2 > f) {
                System.out.println("Guarte");
            } else {
                System.out.println("Empate");
            }
        }

        sc.close();

    }
}
