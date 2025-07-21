package shivani_Java;


public class AscDsc {
	
public static boolean isAscending(int[] arr) {
    if (arr == null || arr.length <= 1) {
        return true; // Single digit or empty array is always sorted
    }
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < arr[i + 1]) { // If a digit is smaller than the one to its left (higher place value)
                                  // then the number is not strictly ascending
            return false;
        }
    }
    return true;
}

public static boolean isDescending(int[] arr) {
    if (arr == null || arr.length <= 1) {
        return true; // Single digit or empty array is always sorted
    }
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) { // If a digit is smaller than the one to its left (higher place value)
                                  // then the number is not strictly ascending
            return false;
        }
    }
    return true;
}

public static void printArray(int[] arr) {
    if (arr == null || arr.length == 0) {
        System.out.println("[]");
        return;
    }
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
}