package org.vashonsd;
import java.util.Scanner;

public class Functions {
    Scanner input = new Scanner(System.in);

    public Functions() {
    }

    public void tempChange() {
        System.out.println("Enter today's temperature in fahrenheit:");
        int temp = input.nextInt();

        System.out.println((temp - 32) * (0.5555) + " degrees Celsius");
    }

    public void acresCalc() {
        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double acres = (width * height) / 43560;
        double rounded = Math.round(acres * 100);
        System.out.println(rounded / 100 + " acres");
    }

    public void itemCost() {
        System.out.print("A can of Peace Tea costs .99 cents\nHow many would you like to buy? ");
        int n = input.nextInt();

        System.out.println(n + " can(s) costs " + (n * .99 + n * .078) + " dollars");
    }

    public void change() {
        System.out.print("Enter an amount of money in dollars and cents: ");
        double money = input.nextDouble();

        int tens = (int) (money / 10) + 1;
        double change = 10 - (money % 10);
        change = Math.round(change * 100);

        System.out.println("You would need " + tens + " ten(s) and you'd get back " + change / 100);
    }

    public void hoursToMinutes() {
        System.out.print("Enter an amount of hours as a decimal: ");

        double time = input.nextDouble();
        int hours = (int) (time / 1);
        int minutes = (int) ((time % 1) * 60);

        System.out.println(hours + " hours and " + minutes + " minutes");
    }

    public void inchesToFeet() {
        System.out.print("Enter your height in inches: ");

        int inches = input.nextInt();
        double feet = ((double) inches) / 12;

        System.out.println(feet);
    }

    public void charAtIndex() {
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.print("Enter an int: ");
        int n = input.nextInt();

        if(n > string.length() || n < 0) {
            while(n > string.length() || n < 0) {
                System.out.println("Please enter a valid int: ");
                n = input.nextInt();
            }
        }
        System.out.println(string.charAt(n));
    }

    public void textAndTag() {
        System.out.print("Enter text: ");
        String string = input.nextLine();

        System.out.print("Enter tag: ");
        String tag = input.nextLine();

        System.out.print("<" + tag + ">" + string + "</" + tag + ">");
    }

    public void removeChar() {
        System.out.print("Enter a non-empty string: ");
        String string = input.nextLine();

        System.out.print("Enter an index: ");
        int n = input.nextInt();

        while(n > string.length() || n < 0) {
                System.out.println("Please enter a valid int: ");
                n = input.nextInt();
        }

        System.out.println(string.substring(0, n) + string.substring(n + 1));
    }

    public void backwardsWord() {
        System.out.println("Enter a non-empty string: ");
        String string = input.nextLine();

        String backwardString = "";
        for(int i = string.length() - 1; i >= 0; i--){
            backwardString += string.substring(i, i + 1);
        }
        System.out.println(backwardString);
    }
}
