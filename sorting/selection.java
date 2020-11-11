package sorting;
/**
 * A Selection sort algorithm sorts an array of elements by iterating and finding the smallest/largest one and then putting it aside into a sorted list. 
 * It continues to sort by finding the smallest/largest unsorted element and adding it to the sorted list of elements.
 * This happens until there are no elements left in the unsorted list.
 * Time Complexity: O(n2) as there are two nested loops.

Auxiliary Space: O(1)
The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.


Stability : The default implementation is not stable. However it can be made stable. Please see stable selection sort for details. 

 */
public class selection {
    //sorting 4 33 76 21 2 using SelectionSort
    public static void main(String[] args) {
        int[] arr = new int[]{4,33, 76, 21, 2};
        int min;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                    temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
                
            }
            System.out.println("Iteration "+i+" result array "); 
           printArray(arr);
            
        }
    }

    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("\n");
    }
    
}
