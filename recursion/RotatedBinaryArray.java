public class RotatedBinaryArray {
     // Main method to test the function
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int result = search(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in array.");
        }
    }

    // Recursive function to search in rotated sorted array
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        // Check if left half is sorted
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }

        // Else, the right half must be sorted
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }

        return search(arr, target, s, m - 1);
    }    
}
