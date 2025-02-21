public class NestedTryCatch {
    public static void handleArrayDivision(int[] arr, int index, int divisor) {
        try {
            try {
                System.out.println(arr[index] / divisor);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }

    public static void main(String[] args) {
        handleArrayDivision(new int[] { 10, 20, 30 }, 5, 0);
    }
}