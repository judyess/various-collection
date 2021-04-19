/*
 * This program uses recursion to reverse a string
 */
package assignment4Question6;
import java.lang.*;
/**
 *
 * @author Judy Soukkhaphon
 */
public class reverseString {
    public static String reverse(String string){
        StringBuffer str = new StringBuffer(string);
        int index = 0;
        char tempX = string.charAt(index);
        char tempY = string.charAt(string.length()-1);
        int rightMostIndex = string.length()-1-index;
        if (index > rightMostIndex){
            return string;
        }
        else{
            return reverse(str, index, rightMostIndex);
        }
    }
    
    private static String reverse(StringBuffer string, int index, int rmIndex){
        StringBuffer str = new StringBuffer(string);
        index++;
        char tempX = string.charAt(index);
        char tempY = string.charAt(string.length()-1);
        str.setCharAt(rmIndex, tempX);
        str.setCharAt(index, tempY);
        return reverse(str, index, rmIndex);
    }
}
