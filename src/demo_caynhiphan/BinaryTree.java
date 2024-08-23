package demo_caynhiphan;

public class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }

    public void add(int value){
        root = addRecursive(root, value);
    }

    public Node addRecursive(Node current, int value) {
        if(current == null){
            return new Node(value);
        }

        if(value<current.getValue()){
            current.setLeft(addRecursive(current.getLeft(),value));
        }else if(value>= current.getValue()){
            current.setRight(addRecursive(current.getRight(),value));
        }

        return current;
    }

    public void inOrderTraversal(Node node){
        if(node==null)
            return;

        inOrderTraversal(node.getLeft());
        System.out.print(node.getValue()+"\t");
        inOrderTraversal(node.getRight());
    }

    public void postOrderTraversal(Node node){
        if(node==null)
            return;

        inOrderTraversal(node.getLeft());
        inOrderTraversal(node.getRight());
        System.out.print(node.getValue()+"\t");
    }
}
