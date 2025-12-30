import java.util.Random;

// ------------------------------------------------------------------
// Array Utility Class (For Q1, Q2, Q3, Q4)
// ------------------------------------------------------------------
class ArrayUtils {
    // Q1: برنامج لنسخ مصفوفة (Clone an Array)
    public static int[] cloneArray(int[] original) {
        return original.clone();
    }

    // Q2: حذف عنصر عشوائي من مصفوفة (Remove a random element)
    public static int[] removeRandom(int[] arr) {
        if (arr.length == 0) return arr;
        int index = new Random().nextInt(arr.length);
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) continue;
            newArr[k++] = arr[i];
        }
        return newArr;
    }

    // Q3: حذف عنصر محدد من مصفوفة (Remove a specific element)
    public static int[] removeElement(int[] arr, int target) {
        int count = 0;
        for (int i : arr) if (i == target) count++;
        if (count == 0) return arr;

        int[] newArr = new int[arr.length - count];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] != target) newArr[k++] = arr[i];
        }
        return newArr;
    }

    // Q4: عكس مصفوفة (Reverse an array)
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
