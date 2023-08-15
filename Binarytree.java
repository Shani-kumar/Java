import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Bt{
        static int idx=-1;
        public Node Buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = Buildtree(nodes);
            newnode.right = Buildtree(nodes);

            return newnode; 
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+",");
        preorder(root.left);
        preorder(root.right);
    }
    public static void levelOrder(Node root){
        Queue<Node> q =new LinkedList<Node>(); 
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){ 
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
                
            
        }
    }
    public static int Countnode(Node root){
        int count =0;
        if(root == null){
            return 0;
        }
        int leftnode = Countnode(root.left);
        int rightnode = Countnode(root.right);
        return leftnode+rightnode+1;
        

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};   // Preorder
        Bt tree=new Bt();
        Node root = tree.Buildtree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // levelOrder(root);
        System.out.println(Countnode(root));
    }
}
