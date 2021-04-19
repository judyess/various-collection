/**
 * A generic bubble-sort-algorithm that uses the comparable or comparator interface.
 * The bubble sort algorithm passes through an array multiple times, 
 *  stepping through each element, comparing it to the very next element.
 * If an element is larger than the one following it, then they swap places.
 * Subsequent passes do not have to compare to elements at the end of the index,
 *  because we have already determined that they contain larger elements.
 * 
 * @Author Judy Soukkhaphon
 */

package Assignment5Question1;


public class BubbleSort{
    public static <T extends Comparable<T>> void bubbleSort(T[] list){
        boolean passAgain = true;
        
        //k represents the part of the array that we have set the largest values to.
        for(int k=1; k<list.length && passAgain; k++){
            passAgain = false;
            for (int i=0; i < list.length-k; i++){  // traverses the array from the beginning to the last index minus k
                if (list[i].compareTo(list[i+1]) > 0){
                    // if a value is larger than the one after it, then they will swap places
                    T temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    
                    passAgain = true; 
                }
            }
        }
    }
    
    /**
     * Creates an array of Circles, sends it as an argument to the method above and prints the results.
     * @param args 
     */
   public static void main(String[] args) {
        Circle[] list = new Circle[] {new Circle(8), new Circle(4),  new Circle(9),  new Circle(2),  new Circle(3)};
        bubbleSort(list);
        for (int i=0; i<list.length; i++){
            System.out.print(list[i] + ", ");
        }
   }

}
