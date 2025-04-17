package workshop3;
    public class assignment01 {
        public static void main(String[] args) {
            int[] array1 = {23, 45, 12, 67, 89, 34, 56, 78};
            
            int[] array2 = new int[array1.length];
            
            // transfering elements from array1 to array2
            for (int i = 0; i < array1.length; i++) {
                array2[i] = array1[i];
            }
            // printing the arrays
            System.out.println("Array1 (Original):");
            printArray(array1);
            
            System.out.println("\nArray2 (After transfer):");
            printArray(array2);
        }
        
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }