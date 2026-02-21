public class RotateArray {

    // helper function to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n

        // reverse whole array
        reverse(arr, 0, n - 1);

        // reverse first k elements
        reverse(arr, 0, k - 1);

        // reverse remaining elements
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(arr, k);

        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}