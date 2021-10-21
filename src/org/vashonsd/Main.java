package org.vashonsd;
import java.util.Scanner;

public class Main {

    static boolean A = true;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while(A == true) {
            System.out.println(
                    "What would you like to do today? (q to quit)\n" +
                            "1. Number methods\n" +
                            "2. String methods\n"
                    );

            String choice = input.nextLine();

            if(choice.equals("q")){
                A = false;
                continue;
            }

            int n = isNumeric(choice);

            if (n == 1) {
                System.out.println(
                        "1. Fahrenheit to Celsius\n" +
                                "2. Width/Height to Acres\n" +
                                "3. Cost of Item(s)\n"
                );

                System.out.println(
                        "4. Money and Change\n" +
                                "5. Hours to Minutes\n" +
                                "6. Inches to Feet\n"
                );

                n = input.nextInt();
                Functions functions = new Functions();

                if (n == 1) {
                    functions.tempChange();
                }

                if (n == 2) {
                    functions.acresCalc();
                }

                if (n == 3) {
                    functions.itemCost();
                }

                if (n == 4) {
                    functions.change();
                }

                if (n == 5) {
                    functions.hoursToMinutes();
                }

                if (n == 6) {
                    functions.inchesToFeet();
                }
            }

            else if (n == 2) {
                System.out.println(
                        "1. Char at index\n" +
                                "2. Tag some text\n" +
                                "3. Remove index char\n" +
                                "4. Reverse word"
                );

                n = input.nextInt();
                Functions functions = new Functions();

                if (n == 1) {
                    functions.charAtIndex();
                }

                if (n == 2) {
                    functions.textAndTag();
                }

                if (n == 3) {
                    functions.removeChar();
                }

                if (n == 4) {
                    functions.backwardsWord();
                }
            }
        }
    }

    public static int isNumeric(String string){
        try {
            int n = Integer.parseInt(string);
            return n;
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid response");
        }
        return 0;
    }
}
