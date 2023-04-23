

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char ch = sc.next().trim().charAt(0);
        // trim() removes the spaces
        // charAt(0) returns char at specific index
        char ch = sc.next().charAt(0); // we don't even have to trim the string

        if( ch >= 'a' && ch <= 'z' ) {
            System.out.println("LowerCase");
        } else {
            System.out.println("UpperCase");
        }
    }
}
