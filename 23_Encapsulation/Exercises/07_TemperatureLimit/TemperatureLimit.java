import java.util.Scanner; 

class Temperature {
    private double temperature;

    boolean setInitialTemperature(double initialTemperature) {
        if (initialTemperature < -273.15) {
            return false;
        }

        temperature = initialTemperature;
        return true;
    }

    boolean increaseTemperature(double changeAmount) {
        if (changeAmount <= 0) {
            return false;
        }

        temperature += changeAmount;
        return true;
    }

    boolean decreaseTemperature(double changeAmount) {
        if (changeAmount <= 0) {
            return false;
        }

        double newTemperature = temperature - changeAmount;
        
        if (newTemperature < -273.15) {
            return false;
        }

        temperature = newTemperature;
        return true;
    }

    double getTemperature() {
        return temperature;
    }
}

public class TemperatureLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an initial temperature in Celsius: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number.");
            scanner.close();
            return;
        }

        double initialTemperature = scanner.nextDouble();
        scanner.nextLine();

        Temperature temperatureObject = new Temperature();

        if (!temperatureObject.setInitialTemperature(initialTemperature)) {
            System.out.println(
                "Invalid temperature! It cannot be below -273.15°C."
            );
            scanner.close();
            return;
        }

        
        double currentTemperature = temperatureObject.getTemperature();

        System.out.print(
            "Please choose whether you want to increase or decrease "
                + "temperature (I/D): "
        );

        String response = scanner.nextLine().trim();

        if (response.isEmpty()) {
            System.out.println("Invalid input! Please choose I or D.");
            scanner.close();
            return;
        }

        if (response.equalsIgnoreCase("I")) {
            System.out.print(
                "Enter the temperature amount to increase in Celsius: "
            );

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.close();
                return;
            }

            double changeAmount = scanner.nextDouble();

            if (temperatureObject.increaseTemperature(changeAmount)) {
                System.out.printf(
                    "Temperature before increase: %.2f°C%n",
                    currentTemperature
                );
                System.out.printf(
                    "Temperature after increase: %.2f°C%n",
                    temperatureObject.getTemperature()
                );
            } else {
                System.out.println(
                    "Increase amount must be greater than 0."
                );
            }
        } else if (response.equalsIgnoreCase("D")) {
            System.out.print(
                "Enter the temperature amount to decrease in Celsius: "
            );

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.close();
                return;
            }

            double changeAmount = scanner.nextDouble();

            if (temperatureObject.decreaseTemperature(changeAmount)) {
                System.out.printf(
                    "Temperature before decrease: %.2f°C%n",
                    currentTemperature
                );
                System.out.printf(
                    "Temperature after decrease: %.2f°C%n",
                    temperatureObject.getTemperature()
                );
            } else {
                System.out.println(
                    "Decrease failed. The amount must be greater than 0, "
                        + "and the final temperature cannot be below -273.15°C."
                );
            }
        } else {
            System.out.println("Please choose only I or D.");
        }

        scanner.close();
    }
}