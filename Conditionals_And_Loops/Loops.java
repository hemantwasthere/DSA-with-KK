

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print no's from 1 to n using for loops
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            System.out.print(i + " ");
//        }

        // print no's from 1 to n using while loops
//        int n = sc.nextInt();
//        int i = 1;
//        while(i<=n){
//            System.out.print(i + " ");
//            i++;
//        }

        // print no's from 1 to n using do-while loops
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i<=n);



    }
}
