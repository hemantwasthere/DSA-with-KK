

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            arrayList.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayList.get(i).add(in.nextInt());
            }
        }

        System.out.println(arrayList);
    }
}
