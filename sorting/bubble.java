package sorting;
/**
 * Why is Bubble sort inefficient?
    In case of bubble sort, n-1 comparisons will be done in the 1st iteration, n-2 in 2nd iteration, n-3 in the 3rd iteration and so on.
     So the total number of comparisons will be, = (n-1) + (n-2) + (n-3) + ..... + 3 + 2 + 1 =n(n-1)/2 = [ n2 n]
    Hence the time complexity of Bubble Sort is O(n2). This shows that too many comparisons are performed in order to sort an array.
     Hence this might cause inefficiency as the size of the array grows.


    Bubble Sort Time Complexity & Space Complexity

    As discussed above,
    The time complexity of bubble sort in C,C++, Java:O(n2)

    Space complexity: O(1)
    The worst-case time complexity: O(n2)
    Average case time complexity: O(n2)
    Best case time complexity: O(n)

    The best-case occurs when the given array is already sorted. In such a case, in one iteration (i.e using n comparisons), 
    we can check and see if were making any swaps in our first iteration. If were not,
    we know that the list is sorted, and we can stop iterating.
 */

public class bubble {
    //sorting 8,5,2,6,12 using Bubblesort
    public static void main(String[] args) {
        int[] arr = new int[]{8,5,2,6,12};
        int temp;
        boolean isSwapped = false;
        /**
         * The programs time complexity is O(n2) even if the array is already in sorted order.
         This can be minimized by breaking the outer loop if the inner loop swap any elements.
        using isSwapped variable
         */
        for (int i = 0; i < arr.length-1; i++) {
            isSwapped = false; 
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                     temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
                if(!isSwapped){
                    break;
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
