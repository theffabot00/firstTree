


public class createTree {
    public static void main(String[] args) {

        System.out.println("starting");

        randomString r = new randomString();

        Node root = new Node("ghhg");
        Tree dummy = new Tree(root);




        for (int n = 0; n != 511; n++) {
            System.out.println("creating node number " + n);
            String s = r.formRandom();
            System.out.println("created: " + s);

            Node m = new Node( s );
            dummy.addNode(m);
            System.out.println("created node number " + n);
        }

        System.out.println("MADE TREE?");

        dummy.printTree();
    }
}

