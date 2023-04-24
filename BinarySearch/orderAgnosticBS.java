public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] nums2 = { 99, 88, 77, 66, 55, 44, 33, 22, 11, 10, 9 };
        System.out.println(orderAgnosticBinarySearch(nums2, 99));

    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        // finding whether the array is sorted or not
        boolean isAsc = arr[0] < arr[n - 1];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (arr[mid] < target)
                    start = mid + 1;
                else if (arr[mid] > target)
                    end = mid - 1;
            } else {
                if (arr[mid] < target)
                    end = mid - 1;
                else if (arr[mid] > target)
                    start = mid + 1;
            }
        }
        return -1;
    }
}
