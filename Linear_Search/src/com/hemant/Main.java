package com.hemant;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5 ,6};
        System.out.println(linearSearch(nums, 4));
    }

    // search in the array: return the index if item found other -1 if item not found
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) return  -1;

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
