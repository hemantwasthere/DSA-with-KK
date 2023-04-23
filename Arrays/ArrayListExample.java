

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Syntax:
        ArrayList<Integer> arrayList = new ArrayList<>(5);

//        arrayList.add(523);
//        arrayList.add(423);
//        arrayList.add(723);
//        arrayList.add(523);
//        arrayList.add(323);
//        arrayList.add(2332);
//        arrayList.add(2332);
//
//        arrayList.remove(5);
//        arrayList.set(0, 121);
//        System.out.println(arrayList.contains(523));
//        System.out.println(arrayList);

        // input
        for (int i = 0; i < 5; i++) {
            arrayList.add(in.nextInt());
        }
        // printing
        for (int i = 0; i < 5; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();


    }
}
