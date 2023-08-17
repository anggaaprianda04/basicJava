import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        if (!myObj.hasNextInt()){
            System.out.print("Error: Invalid input. Please enter an integer.");
        }

        int result = myObj.nextInt();
        if (result % 15 == 0){
            System.out.print("Output : " + "Fizzbuzz");
        } else if (result % 5 == 0) {
            System.out.print("Output : " + "Buzz");
        } else if (result % 3 == 0) {
            System.out.print("Output : " + "Fizz");
        } else {
            System.out.print("Output : " + result);
        }

    }
}