/*
Judy Soukkhaphon
due 9/19/18
Assignment 3
*/

package Assignment3;

public class BST<AnyType extends Comparable<? super AnyType>>{

    protected BinaryNode<AnyType> root;
    public BST(){
        root = null;
    }
    
    public void insert(AnyType node){
        root = insert(node, root);   // Every time insert is called, root is updated
    }
    
    public AnyType find(AnyType x){
        return elementAt(find(x, root));
    }
    private AnyType elementAt(BinaryNode<AnyType> t){
        return t == null ? null : t.nodeData;
    }
    
    /**
     * METHOD TO INSERT ITEMS INTO A SUBTREE
     * @param newNode IS THE ITEM WE WANT TO INSERT
     * @param currentNode STARTS AS THE NODE THAT ROOTS THE TREE
     * @return THE NEW ROOT
     * THROWS DuplicateItemException IF newNode ALREADY EXISTS IN THE TREE
     * 
     * Called by:
     *  treeName.insert(newItem,currentNode)
     * Implemented as:
     *  root = insert(newItem, currentNode)
     */
    protected BinaryNode<AnyType> insert(AnyType newNode, BinaryNode<AnyType> currentNode){
        if(currentNode == null)                               // if no nodes currently exist, then t is constructed and x is the value assigned
            currentNode = new BinaryNode<AnyType>(newNode);
        else if(currentNode != null)
            currentNode.height++;
        else if(newNode.compareTo(currentNode.nodeData) < 0)  {       // if the compareTo method returns a value less than 0, then x is less than t.
            currentNode.leftSub = insert(newNode, currentNode.leftSub);                 // and x is inserted to the left of t.
        }
        else if(newNode.compareTo(currentNode.nodeData) > 0)  {       // if the compareTo method returns a value greater than 0, then x is greater than t.
            currentNode.rightSub = insert(newNode, currentNode.rightSub);               // and x is inserted to the right of t.  
        }
        else
            System.out.println("Duplicate");
        
        return currentNode;
    }
    
    private BinaryNode<AnyType> find( AnyType x, BinaryNode<AnyType> t ){
        while( t != null ){
            if( x.compareTo( t.nodeData ) < 0 )
                t = t.leftSub;
            else if( x.compareTo( t.nodeData ) > 0 )
                t = t.rightSub;
            else
                return t;           // Match
        }
        return null;                // Not found
    }
    
    
    public void preorder(BinaryNode<AnyType> x){
        System.out.println(root);
        if(root.leftSub != null){
            System.out.println(root.leftSub);
            preorder(root.leftSub);
        }
        else if(this.root.rightSub != null){
            System.out.println(root.rightSub);
            preorder(root.rightSub);
        }
        else{
            System.out.println("    ");
        }
            
        
    }
    
    public int BalanceFactor(BinaryNode<AnyType> root){
       BinaryNode<AnyType> left = root.leftSub;
       BinaryNode<AnyType> right = root.rightSub;
       int BF = left.height - right.height;
       return BF;  
    }
    
    
    
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(5);
        tree.insert(85);
        tree.insert(89);
        tree.insert(3);
        tree.insert(2);
        tree.insert(8);
        tree.insert(65);
        tree.insert(92);
        System.out.println();
        
    }

}