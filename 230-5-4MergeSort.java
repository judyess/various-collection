/**
 * A generic Merge-Sort algorithm that uses the comparable or comparator interface.
 * This algorithm works by recursively dividing an array in two, until the sub-arrays contain only 1 element.
 * and merges each pair of those sub-arrays back, such that the elements are in order.
 * 
 * @author Judy Soukkhaphon
 */
package Assignment5Question4;

public class MergeSort<T>{
    
    /**
     * This method will recursively divide the array into smaller and smaller 
     *  sub-arrays until the sub-arrays only contain 1 element
     * @param <T>
     * @param list 
     */
    public static <T extends Comparable<T>> void mergeSort(T[] list){
        if(list.length > 1) {   
            /* 
            create a new array, half its size
            then Copy the array from the beginning of the list to the half-mark
            */
            T[] left;
            left = (T[]) new Circle[list.length/2];     // Kept running into a casting error
            System.arraycopy(list, 0, left, 0, list.length/2);
            // Call the function again to continue splitting this piece in 2.
            mergeSort(left);                               
            
            /*
            create another array to represent the other half of the list,
            then Copy the array from the half-mark to the end of the list.
            */
            int rightLength = list.length - list.length/2; 
            T[] right = (T[]) new Circle[rightLength];
            System.arraycopy(list, list.length/2, right, 0, rightLength);
            mergeSort(right);                              
        
            merge(left, right, list);                   
        }

    }   
    /**
     * This method compares the elements from 2 halves of an array and merges them in ascending order.
     * @param <T>
     * @param list1
     * @param list2
     * @param temp
     * @return 
     */
    public static <T extends Comparable<T>> T[] merge(T[] list1, T[] list2, T[] temp){
        int current1 = 0;   // Current index in list1
        int current2 = 0;   // Current index in list2
        int current3 = 0;   // Current index in temp        
        /**
         * This loop compares the elements between the two sub-arrays (list1, list2),
         * whichever element is smaller will be assigned to list3 at that same index.
         */
        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1].compareTo(list2[current2]) < 0){    // if the element in list1 is less than list2        
                temp[current3++] = list1[current1++];               // then element from list1, will move to list3
            }
            else{
                temp[current3++] = list2[current2++];               // otherwise, list2 goes to list3.
            }
        }        
        /**
         * After we compare and sort the elements between the two arrays, they may not be the same size at the end.
         * So these loops will merge the rest of the array thats left behind.
         */
        while (current1 < list1.length)
            temp[current3++] = list1[current1++];
        
        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
        
        return temp;
        } 
    
    
    
    /**
     * Creates an array of Circles, sends it as an argument to the method above and prints the results.
     * @param args 
     */
    public static void main(String[] args) {
        Circle[] list = new Circle[] {new Circle(8), new Circle(4),  new Circle(9),  new Circle(2),  new Circle(3)};
        mergeSort(list);

        for (int i=0; i<list.length; i++){
            System.out.print(list[i] + ", ");
        } 
    }
}