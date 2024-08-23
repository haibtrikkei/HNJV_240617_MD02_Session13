package demo_caynhiphan;

public class Test {
    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();

        obj.add(40);
        obj.add(30);
        obj.add(50);
        obj.add(25);
        obj.add(35);
        obj.add(45);
        obj.add(60);
        obj.add(15);
        obj.add(28);
        obj.add(55);
        obj.add(70);

        System.out.println("Duyet theo InOrder: ");
        obj.inOrderTraversal(obj.root);

        System.out.println("\nDuyet theo Post Order: ");
        obj.postOrderTraversal(obj.root);
    }
}
