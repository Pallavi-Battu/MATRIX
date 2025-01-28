
public class matrixinput{
    public static void main(String[] args) {
        int size = 5;
        int[] array = new int[size];

        // Input elements
        for (int i = 0; i < size; i++) {
            array[i] = i + 1; // Example input, can be replaced with actual input logic
        }

        // Print elements
        System.out.println("Elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

