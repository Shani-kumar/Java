class node{
    int val;
    node left;
    node right;
    node(int data){
        val=data;
        left=null;
        right=null;
    }
}
public class tree {
    public static void main(String[] args) {
        node head=new node(0);
        head.left=new node(1);
        head.right=new node(2);
        head.left.left=new node(3);
        head.left.right=new node(4);
        

        
    }
}
