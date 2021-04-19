/**
 * A generic Insertion-Sort algorithm that uses the comparable or comparator interface.
 * This algorithm works by stepping through each element and comparing it to 
 * the part of the array that exists to the left of it.
 * The element compares itself to members of the sub-array from right to left, 
 * pushing elements that are larger than it up an index (to the right), 
 * or inserts itself where its at if the element is found to be smaller than it.
 */

package Assignment5Question3;


public class InsertionSort{
    public static <T extends Comparable<T>> void insertionSort(T[] list) {
        for (int i = 1; i < list.length; i++){  // this outer loop determines the element being compared to the sub-array.
            T current = list[i];
            int k;
            for(k = i-1; k >= 0 ; k--){         // this inner loop determines the sub-array and results of comparison
                if (list[k].compareTo(current) > 0){
                list[k+1] = list[k];
                }
            }
            // when the current element is found to be larger than list[k], it will insert itself one index above it.
            list[k+1] = current;
        }
    }
    
    /**
     * Creates an array of Circles, sends it as an argument to the method above and prints the results.
     * @param args 
     */
    public static void main(String[] args) {
        Circle[] list = new Circle[] {new Circle(8), new Circle(4),  new Circle(9),  new Circle(2),  new Circle(3)};
        insertionSort(list);
        for (int i=0; i<list.length; i++){
            System.out.print(list[i] + ", ");
        }
    }
}