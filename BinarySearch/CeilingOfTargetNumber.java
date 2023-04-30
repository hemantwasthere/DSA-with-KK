class CeilingOfTargetNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(ceiling(arr, 15));
        System.out.println(floorOfNumber(arr, 15));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return arr[mid];
            else if (arr[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return arr[start];
    }

    static int floorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return arr[mid];
            else if (arr[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return arr[end];
    }

}