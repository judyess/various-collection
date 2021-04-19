/**
 * @about This program determines all pairs of positive integers (a,b) between 0-1000
 *          such that a is less than b, and b is less than 1000
 *          and ((a^2) + (b^2) + 1) / (ab) is an integer.
 * @author judy soukkhaphon
 */

public class Question4{
    /**
     * The main function is used to call and set up the arguments for the equation function
     * @param args 
     */
    public static void main(String[] args) {
        int n = 1000;
        for (int b = 1; b <= n; b++){
            for (int a = 1; a < n; a++){
                if(a<b){
                    double eq = equation(a,b);
                    if(isInteger(eq)==true){
                        System.out.println(a + ", " + b);
                    }
                }
            }
        }   
    }
    
    /**
     * This function defines the equation 
     * @param a
     * @param b
     * @return eq 
     */
    public static double equation(double a, double b){
        double eq = (Math.pow(a,2) + Math.pow(b, 2) + 1)/(a*b);
        return eq;
    }
    
    /**
     * This function accepts a number value and determines if it is a whole number
     * @param x
     * @return isInteger, a true or false value
     */
    public static boolean isInteger(double x){
        boolean isInteger = false;
        x%=1;
        if(x==0){
            isInteger = true;
        }
        return isInteger;
    }
}
