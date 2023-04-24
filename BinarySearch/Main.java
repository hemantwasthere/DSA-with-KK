public class Main {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 99 };
        System.out.println(binarySearch(nums, 2));
    }

    static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            // int mid = (start + end) / 2; --> this might exceed the int limit
            // same thing as above - just better way to find middle element
            int mid = start + (end - start) / 2;
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }

}
