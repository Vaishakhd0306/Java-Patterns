import java.util.Scanner;

//Inheritence

//Base class:
class Vehicle {

    public String numberOfVehicle;

    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
        System.out.println(numberOfVehicle);
    }

    public void printVehicleNumber() {
        System.out.println(numberOfVehicle);
    }

}

// Derived class:
class Car extends Vehicle {
    public Car(String numberOfcar) {
        super(numberOfcar);
    }
}

// Derived class:
class Bus extends Vehicle {
    public Bus(String numberOfBus) {
        super(numberOfBus);
    }
}

class Test {
    // constructor

    public Test(int number) {
        this.number = number;
        System.out.println(number);
    }

    public void temp() {
        System.out.println("hello world");
    }

    // setters checking;
    private int number;
    private String password = "123";

    public void checkBal(int number, String password) {
        if (this.password == password) {
            this.number = number;
            System.out.println(number);
            System.out.println("success");

        } else {
            System.out.println("Invalid password");
        }
    }

    public void printBalance() {
        System.out.println(number);
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
        Test test = new Test(500);
        test.checkBal(2000, "123");
        test.printBalance();
        // object for inheritance:

        Car car = new Car("KA12A0006");
        Bus bus = new Bus("KA12F2222");
        bus.printVehicleNumber();
        car.printVehicleNumber();
    }

}
