package G3Converter;

import java.util.Scanner;

import static G3Converter.Unit.*;

public class Converter {

    private static final String LOGO = "                                                                                                                                             \n" +
            "                           ,,                                                                                                                \n" +
            "`7MMF'   `7MF'             db   mm                                                               mm                         .g8\"\"\"bgd        \n" +
            "  MM       M                    MM                                                               MM                       .dP'     `M        \n" +
            "  MM       M `7MMpMMMb.  `7MM mmMMmm      ,p6\"bo   ,pW\"Wq.`7MMpMMMb.`7M'   `MF'.gP\"Ya `7Mb,od8 mmMMmm .gP\"Ya `7Mb,od8     dM'       `pd\"\"b.  \n" +
            "  MM       M   MM    MM    MM   MM       6M'  OO  6W'   `Wb MM    MM  VA   ,V ,M'   Yb  MM' \"'   MM  ,M'   Yb  MM' \"'     MM        (O)  `8b \n" +
            "  MM       M   MM    MM    MM   MM       8M       8M     M8 MM    MM   VA ,V  8M\"\"\"\"\"\"  MM       MM  8M\"\"\"\"\"\"  MM         MM.    `7MMF'  ,89 \n" +
            "  YM.     ,M   MM    MM    MM   MM       YM.    , YA.   ,A9 MM    MM    VVV   YM.    ,  MM       MM  YM.    ,  MM         `Mb.     MM  \"\"Yb. \n" +
            "   `bmmmmd\"' .JMML  JMML..JMML. `Mbmo     YMbmd'   `Ybmd9'.JMML  JMML.   W     `Mbmmd'.JMML.     `Mbmo`Mbmmd'.JMML.         `\"bmmmdPY     88 \n" +
            "                                                                                                                                    (O)  .M' \n" +
            "                                                                                                                                     bmmmd'  ";

    public static void main(String[] args) {
        int selection;
        do {
            selection = mainMenu();

            switch (selection){
                case 1:
                    showDistanceMenu();
                    break;
                case 2:
                    showCurrencyMenu();
                    break;
                case 3:
                    showWeightMenu();
                    break;
                case 4:
                    //show...Menu2();
                    break;
            }

        } while(selection != 0);
        System.out.println("Good bye!");
    }

    private static void showDistanceMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n********** DISTANCE CONVERTER **********");
            System.out.println("Possible unit conversions:");
            System.out.println("\nMillimeters, Centimeters, Meters, Kilometers, Inches, Feet, Yards and Miles\n");
            String fromUnit;
            String toUnit;
            do {
                System.out.print("Convert from: ");
                fromUnit = scanner.next();
            } while (!DISTANCE_ASSOCIATION_LIST.containsKey(fromUnit));
            do {
                System.out.print("Convert to: ");
                toUnit = scanner.next();
            } while (!DISTANCE_ASSOCIATION_LIST.containsKey(toUnit));
            System.out.print("\nValue: ");
            Double result = new DistanceConverter(fromUnit, toUnit).convert(scanner.nextDouble());
            System.out.printf("The result is: %f\n%n", result);
            System.out.print("Do you want to perform another conversion? (Y/N): ");
        } while(scanner.next().equals("Y"));
    }
    private static void showWeightMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n********** Weight CONVERTER **********");
            System.out.println("Possible unit conversions:");
            System.out.println("\n Grams, Kilograms, Tonnes, Milligrams, Micrograms\n");
            String fromUnit;
            String toUnit;
            do {
                System.out.print("Convert from: ");
                fromUnit = scanner.next();
            } while (!WEIGHT_ASSOCIATION_LIST.containsKey(fromUnit));
            do {
                System.out.print("Convert to: ");
                toUnit = scanner.next();
            } while (!WEIGHT_ASSOCIATION_LIST.containsKey(toUnit));
            System.out.print("\nValue: ");
            Double result = new WeightConverter(fromUnit, toUnit).convert(scanner.nextDouble());
            System.out.printf("The result is: %f\n%n", result);
            System.out.print("Do you want to perform another conversion? (Y/N): ");
        } while(scanner.next().equals("Y"));
    }

    private static void showCurrencyMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n********** CURRENCY CONVERTER **********");
            System.out.println("Possible currency conversions:");
            System.out.println("\nDollars, Euro, Swedish Crowns, Japanese Yen\n");
            String fromUnit;
            String toUnit;
            do {
                System.out.print("Convert from: ");
                fromUnit = scanner.next();
            } while (!CURRENCY_ASSOCIATION_LIST.containsKey(fromUnit));
            do {
                System.out.print("Convert to: ");
                toUnit = scanner.next();
            } while (!CURRENCY_ASSOCIATION_LIST.containsKey(toUnit));
            System.out.print("\nValue: ");
            Double result = new CurrencyConverter(fromUnit, toUnit).convert(scanner.nextDouble());
            System.out.printf("The result is: %f\n%n", result);
            System.out.print("Do you want to perform another conversion? (Y/N): ");
        } while(scanner.next().equals("Y"));
    }

    private static Integer mainMenu(){
        System.out.flush();
        System.out.println(LOGO);
        System.out.println("Welcome to the G3 Unit Converter.\n\n");
        System.out.println("************** MAIN MENU ***************");
        showMenu();
        System.out.print("Select an option (1-4): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void showMenu(){
        System.out.println("1. Distance conversion");
        System.out.println("2. Weight conversion");
        System.out.println("3. Currency conversion");
        System.out.println("4. ... conversion");
        System.out.println("0. Exit");
    }
}
