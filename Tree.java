
public class Tree {

    private Node root;

    Tree(Node n) {
        this.root = n;
    }

    public boolean searchFor(String s) {
        Node focus = this.root;
        while (focus != null) {
            if (focus.getData().compareTo(s) == -1) {
                focus = focus.getLeft();
            } else {
                if (focus.getData().compareTo(s) == 1) {
                    focus = focus.getRight();
                }
            }
            //this is less about efficiency and mroe caboiut consuistency
            if (focus.getData().compareTo(s) == 0) {
                return true;
            }
            
        }
        return false;
    }

    public boolean addNode(Node n) {
        //this is going alphabetically
        Node focus = this.root;
        String dat = n.getData();

        // System.out.println("BEGIN LOOP");
        boolean added = false;
        while (!added) {
            System.out.println(focus.getData().compareTo(dat));
            if (focus.getData().compareTo(dat) > 0) {
                if (focus.getLeft() != null) { 
                    focus = focus.getLeft();

                    // System.out.println("FOCUS ON THE LEFT");
                } else {
                    focus.setLeft(n);
                    // System.out.println("CRYSTALLIZE ON THE LEFT");
                    return(true);
                }
            } else {
                if (focus.getData().compareTo(dat) < 0) {
                    if (focus.getRight() != null) {
                        focus = focus.getRight();

                        // System.out.println("FOCUS ON THE right");
                    } else {
                        focus.setRight(n);
                        // System.out.println("CRYSTALLIZE ON THE right");
                        return(true);
                    }
                }
            }
            //this is less about efficiency and mroe caboiut consuistency
            if (focus.getData().compareTo(dat) == 0) {
                return false;
            }
        }
        return(false);
    }

    public void printTree() {
        this.root.printBranch();
    }
}


