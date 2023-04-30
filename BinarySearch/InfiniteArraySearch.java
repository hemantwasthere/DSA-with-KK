public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40 };
        int target = 40;
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

            if (end > arr.length - 1) {
                end = arr.length - 1;
            }

            if (start > arr.length - 1) {
                System.out.println("Element not found");
                return;
            }
        }

        System.out.println(binarySearch(arr, target, start, end));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
