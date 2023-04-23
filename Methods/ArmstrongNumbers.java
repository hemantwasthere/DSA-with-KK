

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));

        // Printing the 3-digit armstrong numbers
        for (int i = 100; i <= 999; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    // Method for checking 3-digit armstrong number
    static boolean isArmstrong(int n){
        int realN = n;
        int sumOfCubedIndividualDigits = 0;
        while (n != 0) {
            int rem = n % 10;
            sumOfCubedIndividualDigits += (rem * rem * rem);
            n /= 10;
        }
        return sumOfCubedIndividualDigits == realN;
    }
}
