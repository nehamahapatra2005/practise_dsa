public class PrintArrayRecursion {

    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return; // base case
        }

        System.out.print(arr[index] + " ");
        printArray(arr, index + 1); // recursive call
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        printArray(arr, 0);
    }
}