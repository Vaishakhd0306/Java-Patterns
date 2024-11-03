import java.util.Scanner;

class Test {
    public void temp() {
        System.out.println("hello world");
    }
}

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult");

        } else {
            System.out.println("Teen");
        }
        sc.close();
        Test ts = new Test();
        ts.temp();
    }

}
