package question2;

/*
 * Uses the substring() method to obtain substrings of a string and 
 * increments the beginning index of the substring for each recursive call to 
 * count the length of a string. Without using the Length method.
 */

/**
 *
 * @author Judy Soukkhaphon
 */
public class RecursiveStringLength {
   static int count;
    
   /**
    * counts the iterations and also sets the start point for the string in the next recursive call 
    * @param string
    * @return 
    */
    public static int stringLength(String string) {
        if (string.equals("")){
            return 0;
        }
        else{
            count++;
            return stringLength(string.substring(1)) + count;    
        }
    }
 

    public static void main(String[] args){
        String string ="abcdefghijklmnopqrstuvwxyz";
        stringLength(string);
        System.out.println(count);
        
    }
}
