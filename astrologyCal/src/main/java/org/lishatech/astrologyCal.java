package org.lishatech;

import java.util.Scanner;

public class astrologyCal {
    static final Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        homeScreen();
    }
    private static void homeScreen (){

        boolean userChoice = true;

        while (userChoice){
            String homeScreen = """
                Welcome to LishaTech Astrology Calculator !
                1. Zodiac Birthday Calculator
                2. Birthstone Calculator
                3. Angel Numbers
                X. Exit
                """;
            System.out.println(homeScreen);
            System.out.print("Please Choose from the following: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    zodicaBday();
                    break;
                case "2":
                    birthStone();
                    break;
                case "3":
                    angelNumbers();
                    break;
                case"X":
                    userChoice = false;
                default:
                     System.out.println("Invalid, please choose another option");
            }
        }
    }

    private static void angelNumbers() {

        boolean userChoice = true;
        while (userChoice) {
            System.out.println("Welcome to LishaTech Angel Number Calculator");
            String instructions = """
                    Below the Angel Number Calculator will ask you to input your birthday individually.
                    First, it will ask for brith month digits.
                    Then, it will ask for your birth date digits.
                    After, it will ask for your birth year digits.
                    Lastly, your angel number will be calculated
                    """;
            System.out.println(instructions);
            System.out.print("Please Enter the first digit of your birth month: ");
            int month1 = scanner.nextInt();
            System.out.print("Please Enter the second digit of your birth month: ");
            int month2 = scanner.nextInt();
            System.out.print("Please Enter the first digit of your birth date: ");
            int birth1 = scanner.nextInt();
            System.out.print("Please Enter the second digit of your birth date: ");
            int birth2 = scanner.nextInt();
            System.out.print("Please Enter the first digit of your birth year: ");
            int year1 = scanner.nextInt();
            System.out.print("Please Enter the second digit of your birth year: ");
            int year2 = scanner.nextInt();
            System.out.print("Please Enter the third digit of your birth year: ");
            int year3 = scanner.nextInt();
            System.out.print("Please Enter the fourth digit of your birth year: ");
            int year4 = scanner.nextInt();

            int angelCal = ((month1 + month2) + (birth1 + birth2) + (year1 + year2 + year3 + year4));
            int firstDigit = angelCal / 10; // Extracts the tends place digit of number
            int secondDigit = angelCal % 10; // Extracts the ones place digit
            int angelDigit = firstDigit + secondDigit;

            String repeatAngelDigt = repeatNumber(angelDigit);

            System.out.println("Your Angel Number is: " + repeatAngelDigt);
            scanner.nextLine();

            System.out.println("Would you like to try another angel number? (Yes/No)");
            String userChoice2 = scanner.nextLine();
            if (!userChoice2.equalsIgnoreCase("Yes")) {
                userChoice = false;
            }

        }

    }

    private static String repeatNumber(int angelDigit) {
        return String.valueOf(angelDigit) + String.valueOf(angelDigit) + String.valueOf(angelDigit);
    }

    private static void birthStone() {

    }

    private static void zodicaBday() {
        boolean userChoice = true;

        while (userChoice){
            String zodiacScreen = """
                Welcome to LishaTech Zodiac Screen
                Please choose from the following date ranges to see your zodiac sign.
                1. (March 21 – April 19)
                2. (April 20 – May 20)
                3. (May 21 – June 20)
                4. (June 21 – July 22)
                5. (July 23 – August 22)
                6. (August 23 – September 22)
                7. (September 23 – October 22)
                8. (October 23 – November 21)
                9. (November 22 – December 21)
                10.(December 22 – January 19)
                11.(January 20 – February 18)
                12. (February 19 – March 20)
                """;
            System.out.println(zodiacScreen);
            System.out.print("Please select the number adjacent to your birthday range:  ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Your Zodiac Sign is: Aries");
                    break;
                case "2":
                    System.out.println("Your Zodiac Sign is: Taurus");
                    break;
                case "3":
                    System.out.println("Your Zodiac Sign is: Gemini");
                    break;
                case "4":
                    System.out.println("Your Zodiac Sign is: Cancer");
                    break;
                case "5":
                    System.out.println("Your Zodiac Sign is: Leo");
                    break;
                case "6":
                    System.out.println("Your Zodiac Sign is: Virgo");
                    break;
                case "7":
                    System.out.println("Your Zodiac Sign is: Libra");
                    break;
                case "8":
                    System.out.println("Your Zodiac Sign is: Scorpio");
                    break;
                case "9":
                    System.out.println("Your Zodiac Sign is: Sagittarius");
                    break;
                case "10":
                    System.out.println("Your Zodiac Sign is: Capricorn");
                    break;
                case "11":
                    System.out.println("Your Zodiac Sign is: Aquarius");
                    break;
                case "12":
                    System.out.println("Your Zodiac Sign is: Pisces");
                    break;
                case "x":
                    userChoice = false;
                default:
                    System.out.println("That is not an option");
                }
                    System.out.print("Would you like to try another Zodiac Sign?: ");
                    String userChoice2 = scanner.nextLine();
                    if (!userChoice2.equalsIgnoreCase("Yes")){
                        userChoice = false;

            }

        }


    }


}
