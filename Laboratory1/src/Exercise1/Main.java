package Exercise1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1Real=2;
        int num1Imag=5;
        int num2Real=4;
        int num2Imag=-1;

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition Result: " + (num1Real+num2Real) +"+i*"+ (num1Imag+num2Imag));
                break;
            case 2:
                System.out.println("Subtraction Result: " + (num1Real-num2Real) + "+i*" + (num1Imag-num2Imag));
                break;
            case 3:
                System.out.println("Multiplication Result: " + (num1Real*num2Real-num1Imag*num2Imag) +"+i*"+ (num1Real*num2Imag + num1Imag*num2Real));
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
