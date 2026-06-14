//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void Insertion_sort( int[] arr ){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void Bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;


            if (arr[mid] == target) {
                return mid;
            }


            if (arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }


        return -1;
    }
    public static void main(String[] args) {
        int[] originalArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("=== TESTING SORTING ALGORITHMS ===");


        int[] bubbleArr = originalArray.clone();
        System.out.print("Bubble Sort Result:    ");
        Bubble_sort(bubbleArr);
        System.out.println();


        int[] selectionArr = originalArray.clone();
        System.out.print("Selection Sort Result: ");
        Selection_sort(selectionArr);
        System.out.println();


        int[] insertionArr = originalArray.clone();
        System.out.print("Insertion Sort Result: ");
        Insertion_sort(insertionArr);
        System.out.println("\n");

        System.out.println("=== TESTING BINARY SEARCH ===");
        int target = 22;
        System.out.println("Searching for target value: " + target);

        int resultIndex = binarySearch(insertionArr, target);

        if (resultIndex != -1) {
            System.out.println("Success! Target found at index: " + resultIndex);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}