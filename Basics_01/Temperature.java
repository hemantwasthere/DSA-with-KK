

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter temperature in Celcius: ");
        float celciusTemp = sc.nextFloat();
        float fahrenheitTemp = (celciusTemp * 1.8f)  + 32;

        System.out.println("temperature in celcius: " + celciusTemp);
        System.out.println("temperature in fahrenheit: " + fahrenheitTemp);
    }
}
