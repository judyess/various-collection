/*
 * This program takes an array of any type, sorts the elements
 * and compares a given key to the objects in the element
 * by treating the array as two halves and searching a side 
 * depending on how the key compares to the middle element
 *
 */
package question1;
import java.util.Arrays;
/**
 *
 * @author Judy Soukkhaphon
 */
public class GenericBinarySearch{

    /**
     * Sets the parameters of the array
     * @param <T>
     * @param list
     * @param key
     * @return 
     */
    public static <T extends Comparable<T>> int BinarySearch(T[] list, T k){
        Arrays.sort(list);      // Sorts the list so we can properly perform the binary search
        int low=0;
        int high=list.length-1;
        T key = k;
        return BinarySearch(list, key, low, high);
    }
    
    /**
     * Helper Method built to accept more arguments than the initial BinarySearch() method
     * @param <T>
     * @param list
     * @param key
     * @param low
     * @param high
     * @return 
     */
    private static <T extends Comparable<T>> int BinarySearch(T[] list, T key, int low, int high){
        if(low>high){           // when the search is exhausted and no match is found
            
            return -low-1;
        }
        else{
            int mid = (low+high)/2;         // determines the middle index
            if (list[mid].compareTo(key) > 0){          
                return BinarySearch(list, key, low, mid-1);     // Recursive call to BinarySearch on the first half of the array
            }
            else if (key==list[mid]){       // When the key is equal to the element at the middle index, search is completed.
                return mid;
            }
            else{
                return BinarySearch(list, key, mid+1, high);    // Recursive call to the BinarySearch on the second half of the array
            }
        } 
    }

    public static <T extends Comparable<T>> void main(String[] args) {
        Circle[] list = new Circle[] {new Circle(7), new Circle(4), new Circle(3),
        new Circle(5), new Circle(6), new Circle(2), new Circle(2)};

        Circle key = new Circle(4);         // Must set the key as the same reference type as the array
        
        System.out.println(BinarySearch(list, key)); 
        
        
        //Prints all the elements in the array list.
        for(int i =0; i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
