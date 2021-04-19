
/**
 * This program Creates an array and checks for matching elements horizontally, vertically or diagonally.
 * 
 *@author Judy Soukkhaphon
 */
import java.util.Scanner;

public class Question5{
    static int n;
    static int m;
    public static Scanner input = new Scanner(System.in);
    
/**
 * The main function is used to create the array and calls the other functions.
 * @param args 
 */
    public static void main(String[] args) {
        getInput();
        int[][] array = createArray();
        System.out.println("Vertical Match: " + checkVertical(array));
        System.out.println("Horizontal Match: " + checkHorizontal(array));
        System.out.println("Diagonal Match: " + checkDiagonal(array));
        
        
    }
    
    /**
     * This function gets user input and assigns the values to n and m.
     */
    public static void getInput(){
        System.out.println("For array([n][m], where n and m are both > 3. \nEnter a value for n:");
        n = input.nextInt();
        
        while (n<4){
            System.out.println("invalid input: Enter a value >= 4: ");
            n = input.nextInt();
        }
        System.out.println("Enter a value for m: ");
        m = input.nextInt();
        while (m<4){
            System.out.println("invalid input: Enter a value >= 4: ");
            m = input.nextInt();
        }  
    }
    
    /**
     * This function creates the array[n][m]
     * @return 
     */
    public static int[][] createArray(){
        int range = (int)(Math.rint(.25*(n*m)));

        int[][] array = new int[n][m];
        
        for (int iRow=0; iRow<array.length; iRow++){
            for (int iCol=0; iCol<array[iRow].length; iCol++){
                array[iRow][iCol]=(int)(Math.random()*range);
            }
        }
        for (int iRow=0; iRow<array.length; iRow++){
            System.out.print(array[iRow][0]);
            for (int iCol=1; iCol<array[iRow].length; iCol++){
                System.out.print(array[iRow][iCol]);
                
            }
            System.out.println(" ");
        }
        
        return array;
    }
    
    /**
     * This function checks for matching elements horizontally
     * @param array
     * @return 
     */
    public static boolean checkHorizontal(int[][] array){
        boolean horizontalMatch = false;
        if (horizontalMatch==false){
            for (int iRow=0; iRow<array.length; iRow++){
            for(int iCol=0; iCol<=(array[0].length - 4); iCol++){
                if(array[iRow][iCol]==array[iRow][iCol+1]){
                    if(array[iRow][iCol+1]==array[iRow][iCol+2]){
                        if(array[iRow][iCol+2]==array[iRow][iCol+3]){
                            horizontalMatch=true;
                            
                        }
                    }
                }
            }
        }
        }
        
        return horizontalMatch;
    }
    
    /**
     * This function checks for matching elements vertically
     * @param array
     * @return 
     */
    public static boolean checkVertical(int[][] array){
        boolean verticalMatch=false;
        if(verticalMatch==false){
            for (int iCol=0; iCol<array.length; iCol++){
            for(int iRow=0; iRow<=(array[0].length -4); iRow++){
                if(array[iRow][iCol]==array[iRow+1][iCol]){
                    if(array[iRow+1][iCol]==array[iRow+2][iCol]){
                        if(array[iRow+2][iCol]==array[iRow+3][iCol]){
                            verticalMatch=true;
                            
                        }
                    }
                }
            }
        }
        }
        
        return verticalMatch;
    }
    
    /**
     * This function checks for matching elements diagonally
     * @param array
     * @return 
     */
    public static boolean checkDiagonal(int[][] array){
        boolean diagonalMatch=false;
        if(diagonalMatch==false){
            for (int iCol=0; iCol<=(array.length-4); iCol++){
            for(int iRow=0; iRow<=(array[0].length-4); iRow++){
                if(array[iRow][iCol]==array[iRow+1][iCol+1]){
                    if(array[iRow+1][iCol+1]==array[iRow+2][iCol+2]){
                        if(array[iRow+2][iCol+2]==array[iRow+3][iCol+3]){
                            diagonalMatch=true;
                            
                        }
                    }
                }
            }
        }
        }
        
        return diagonalMatch;
    }
    
}