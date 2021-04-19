/**
 * This program calculates the prime numbers between 0-1000
 * @author Judy Soukkhaphon
 */
public class Question3{
    
    /**
     * The main function is used to set up the array and call the other functions.
     * @param args 
     */
    public static void main(String[] args) {
        //sets each element in the array to 1.
        int[] a = new int[1000];
        for(int i=0; i<a.length; i++){
            a[i]=1;
        }
        
        findPrime(a);
        printPrime(a);
    }
    
    /**
     * This function traverses the entire array for each element beginning at the next index, 
     * then divides the following indexes by the currentIndex to see if it results in a whole number, 
     * If it does, the element at that index is set to 0 indicating that it is not prime.
     * @param array 
     */
    public static void findPrime(int[] array){
        for(int currentIndex=2; currentIndex<array.length; currentIndex++){
            for(int ix=currentIndex+1; ix<array.length; ix++){
                double prime = ix%currentIndex;
                if(prime==0){
                    array[ix]=0;           }
            }
        }
    }
    
    /**
     * This function traverses the array for elements that equal 1, Then prints its index.
     * @param array 
     */
    public static void printPrime(int[] array){
        for(int index=2; index<array.length; index++){
            if (array[index]==1){
                System.out.println(index + " ");
        
            }

        }
    }
    
}