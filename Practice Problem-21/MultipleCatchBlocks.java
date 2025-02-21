// import java.util.*;

public class MultipleCatchBlocks {
    public static void arrayOperation(Integer[] arr, int index) {
        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }

    public static void main(String[] args) {
        arrayOperation(new Integer[] { 1, 2, 3 }, 5);
    }
}