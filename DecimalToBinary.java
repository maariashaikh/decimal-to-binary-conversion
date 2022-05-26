import java.util.Scanner;


public class DecimalToBinary {

    public static void main(String[] args) {

        int number;


        System.out.print("**********Welcome to Decimal to Binary Conversion Program!**********");

        System.out.print("Please enter a decimal number:   ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        System.out.println("Binary form : " + integerToBinary(number));


    }// main

    private static String integerToBinary(int number){

        String binaryNumber = "";
        if(0 == number ){
            binaryNumber = "0"; // 1 operations
        }
        else {
            while(number > 0) {
                binaryNumber = number % 2  + binaryNumber;
                number /= 2 ; //log_2n operations
            }// while
        }
        return binaryNumber;
    }// integerToBinary
}

// Total number of operations = 1 +log_2n operations (don't count 1)