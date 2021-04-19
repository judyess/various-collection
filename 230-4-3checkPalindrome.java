/*
 * This program returns true if a given string is a palindrome, false if otherwise..
 */
package question3;

/**
 *
 * @author Judy Soukkhaphon
 */
public class checkPalindrome {
    static boolean isPalindrome=true;
    static int step=1;
    
    static public boolean checkPal(String string){
        int left = 0;
        int right = string.length()-1;
        if (string.charAt(left) != string.charAt(right)){
            return isPalindrome=false;
        }
        else{
            return checkPal(string, left, right);
        }
        
    }
    
    /**
     * Helper method that takes additional arguments for left and right representing indices
     * @param string
     * @param left
     * @param right
     * @return 
     */
    static public boolean checkPal(String string, int left, int right){
        if (string.charAt(left) != string.charAt(right)){
            return isPalindrome=false;
           
        }
        else if (left>right || left==right){
            return isPalindrome = true;
        }
        
        else{
            left+=step;
            right-=step;
            return checkPal(string, left, right);
        }
    }
    
    public static void main(String[] args) {
        String string = "tot";
        System.out.println(checkPal(string));
       // System.out.println(isPalindrome);
    }
}
