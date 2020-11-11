package sorting;
/**
 * Note: Subscripts are only used for understanding the concept.

Input : 4A 5 3 2 4B 1
Output : 1 2 3 4B 4A 5

Stable Selection Sort would have produced
Output : 1 2 3 4A 4B 5

Selection sort works by finding the minimum element and then inserting it in its correct position by swapping with the element which is in the position of this minimum element. This is what makes it unstable.

Swapping might impact in pushing a key(let’s say A) to a position greater than the key(let’s say B) which are equal keys. which makes them out of desired order.
In the above example 4A was pushed after 4B and after complete sorting this 4A remains after this 4B. Hence resulting in unstability.
 */
public class StableSelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4,33, 76, 21, 2};
        int min;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
                int key = arr[min]; 
                while(min>i){
                    arr[min] = arr[min-1];
                    min--;
                }
                arr[i] = key;
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
