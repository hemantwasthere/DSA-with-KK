

public class Main {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll no's:
//        int[] rollnos = new int[5];
        // or directly
//        int[] rollnos2 = {12, 23, 53, 35, 54};

        int[] rollnos; // declaration of array. rollnos is getting defined in the stack
        rollnos = new int[5]; // initialisation: actually here object is being created in memory(heap)
        System.out.println(rollnos[1]); // all the elements are 0 by default

        String[] strings = new String[5];
        System.out.println(strings[1]); // all the ele's are null by default in string array


    }
}