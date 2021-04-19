/*
 * This program reverses the order of a given integer
 */

package assignment4Question4;

/**
 *
 * @author Judy Soukkhaphon
 */
public class reverseInteger {
    public static int reverse(int d){
        if (d != 0){
            int r = d%10;
            int q = d/10;
            Math.floor(q);
            System.out.print(r);
            return reverse(q);
        }
        else{
            System.out.println(" ");
            return 0;
        }
    }
    
    public static void main(String[] args) {
        reverse(123);
    }
}
