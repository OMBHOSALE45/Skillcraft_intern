import java.util.Scanner;

public class temp_conversion {

    // Celsius function 1
    public static double celsiusToFahrenheit(double cel) {
        return (cel * 9 / 5) + 32;
    }

    // Celsius function 2
    public static double celsiusToKelvin(double cel) {
        return cel + 273.15;
    }

    // Fahrenheit function 1
    public static double fahrenheitToCelsius(double fahren) {
        return (fahren - 32) * 5 / 9;
    }

    // Fahrenheit function 2
    public static double fahrenheitToKelvin(double fahren) {
        return (fahren - 32) * 5 / 9 + 273.15;
    }

    // Kelvin function 1
    public static double kelvinToCelsius(double kel) {
        return kel - 273.15;
    }

    // Kelvin function 2
    public static double kelvinToFahrenheit(double kel) {
        return (kel - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double result = 0;
        Scanner sc = new Scanner(System.in);

        // Choose inputs for conversion
        System.out.print("Enter the input scale (Celsius, Fahrenheit, Kelvin): ");
        String inputScale = sc.nextLine().trim().toLowerCase(); // Normalize input

        System.out.print("Enter the target scale (Celsius, Fahrenheit, Kelvin): ");
        String targetScale = sc.nextLine().trim().toLowerCase(); // Normalize input

        System.out.print("Enter the temperature value: ");
        double inputValue = sc.nextDouble();

        // Perform conversion
        if (inputScale.equals("celsius")) {
            if (targetScale.equals("fahrenheit")) {
                result = celsiusToFahrenheit(inputValue);
            } else if (targetScale.equals("kelvin")) {
                result = celsiusToKelvin(inputValue);
            } else {
                System.out.println("No conversion needed as input and target scales are the same.");
                result = inputValue;
            }
        } else if (inputScale.equals("fahrenheit")) {
            if (targetScale.equals("celsius")) {
                result = fahrenheitToCelsius(inputValue);
            } else if (targetScale.equals("kelvin")) {
                result = fahrenheitToKelvin(inputValue);
            } else {
                System.out.println("No conversion needed as input and target scales are the same.");
                result = inputValue;
            }
        } else if (inputScale.equals("kelvin")) {
            if (targetScale.equals("celsius")) {
                result = kelvinToCelsius(inputValue);
            } else if (targetScale.equals("fahrenheit")) {
                result = kelvinToFahrenheit(inputValue);
            } else {
                System.out.println("No conversion needed as input and target scales are the same.");
                result = inputValue;
            }
        } else {
            System.out.println("Invalid input scale. Please enter Celsius, Fahrenheit, or Kelvin.");
            
        }

    
        System.out.println("The conversion of"+" "+inputScale+" "+"to"+" "+targetScale+" "+"is"+" "+result);

        sc.close();
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
