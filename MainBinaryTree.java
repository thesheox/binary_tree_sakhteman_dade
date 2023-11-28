public class MainBinaryTree {
    public static void main(String[] args) {
        LinkedBinaryTree<String> tree=new LinkedBinaryTree<String>();
        tree.addRoot("+");
        tree.addLeft(tree.root, "*");
        tree.addRight(tree.root, "-");
        tree.addLeft(tree.left(tree.root),"5");
        tree.addRight(tree.left(tree.root),"4");
        tree.addLeft(tree.right(tree.root),"100");
        tree.addRight(tree.right(tree.root),"/");
        tree.addLeft(tree.right(tree.right(tree.root)),"20");
        tree.addRight(tree.right(tree.right(tree.root)),"2");
        for(String s:tree){
            System.out.print(s+" ");
        }
    }
    
}
