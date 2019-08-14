

//this is actually the second time im making a node thing
//but rather than making everything modular, im keeping this to being binary


public class Node {

    private String topData = "";
    private Node parent;
    private boolean rootStatus = false;

    private int dist;
    //binary tree; follows the normal rules
    private Node leftNode;
    private Node rightNode;

    //constructor
    public Node(String s) {
        this.topData = s;
    }

    //getters
    public boolean getRootStatus() {
        return(this.rootStatus);
    }

    public String getData() {
        return(this.topData);
    }

    public Node getLeft() {
        return(this.leftNode);
    }

    public Node getRight() {
        return(this.rightNode);
    }

    //setters
    public void editRootStatus(boolean b) { //note: never run this; might delete later
        this.rootStatus = b;
        this.parent = null;
        if (b) {
            this.dist = 0;
        }
    }

    public boolean[] childStatus() {
        boolean[] nods = { true, true }; 
        if (this.leftNode == null) {
            nods[0] = false;
        }
        if (this.rightNode == null) {
            nods[1] = false;
        }
        return( nods );
    }

    //KINDLY NOTE THAT THESE FOLLOWS 0 RULES AND JSUT OVERWRITES
    public void setLeft(Node n) {
        this.leftNode = n;
        n.parent = this;
        n.dist = this.dist + 1;
    }

    public void setRight(Node n) {
        this.rightNode = n;
        n.parent = this;
        n.dist = this.dist + 1;
    }

    public void printBranch() {
        for (int n = 0; n != this.dist; n++) {
            System.out.print("|-");
        }
        System.out.print(this.topData);
        System.out.println("");
        if (this.leftNode != null) {
            this.leftNode.printBranch();
        }
        if (this.rightNode != null) {
            this.rightNode.printBranch();
        }
    }
}
