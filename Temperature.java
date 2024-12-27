import java.util.*;

public class Temperature {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        System.out.println("Temperature Convertor:");
        while (isTrue) {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                continue;
            }

            System.out.print("Enter the temperature to convert: ");
            double input = sc.nextDouble();
            double temp;

            if (choice == 1) {
                temp = celsiusToFahrenheit(input);
                System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", input, temp);
            } else {
                temp = fahrenheitToCelsius(input);
                System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", input, temp);
            }

            System.out.print("Convert Again? (yes/no): ");
            sc.nextLine();
            String response = sc.nextLine().toLowerCase();
            if (response.equals("no")) {
                isTrue = false;
                System.out.println("Thank you for using the Temperature Convertor.");
            }
        }
        sc.close();
    }
}
