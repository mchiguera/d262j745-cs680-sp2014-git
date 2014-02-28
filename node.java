//Code In LOCAL FILE
package client;

/****************************************************
Mod 001 MCH 02/16/2014 Add block
*****************************************************/

public class Node_class2 {
    private int value;
    private Node rChild;
    private Node lChild;
    private Node predecessor;

    public Node(int value, Node rChild, Node lChild) {
        super();
        this.value = value;
        this.rChild = rChild;
        this.lChild = lChild;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getPredecesor() {
        return this.predecessor;
    }

    public void setPredecesor(Node pred)

    {
        this.predecessor = pred;
    }

    public void setRChild(Node rChild) {
        this.rChild = rChild;
    }

    public Node getRChild() {
        return rChild;
    }

    public void setLChild(Node lChild) {
        this.lChild = lChild;
    }

    public Node getLChild() {
        return lChild;
    }

    public Node() {
        super();
        this.value = 0;
        this.rChild = null;
        this.lChild = null;
        this.predecessor=null;


    }
    public Node(int value) {
        super();
        this.value = value;
        this.rChild = null;
        this.lChild = null;
        this.predecessor= null;


    }

    public boolean AddValue(int new_value) {

        if (this.value == 0) {
            this.value = new_value;
        } else {
            /* if (this.value > new_value)
            {
                // this.rChild = new Node();
                if (this.lChild == null) {
                this.lChild = new Node();
                System.out.println("Left Child");
                       System.out.println(new_value);

                this.getLChild().setValue(new_value);
                }
            }else {
                this.rChild = new Node();
                this.getRChild().setValue(new_value);
                System.out.println("Right Child");
                System.out.println(new_value);
            }

            */
        }

        return true;
    }

    public Node getLeftSuccesor() {
        return this.getLChild();
    }

    public Node getRightSuccesor() {
        return this.getRChild();
    }

    public boolean isRoot() {
        if (getPredecesor() != null) {
            return true;
        }
        return false;
    }

    public void addRootValue(int value) {
        this.value = value;
    }


    public Node findBranch() {
        Node leaf;
        return this;
    }

    public int lengthRightTree() {
        int count = 0;

        return 0;
    }

    public int lengthLeftTree() {
        return 0;
    }

    public boolean isBalance() {
        int lenR = lengthRightTree();
        int lenL = lengthLeftTree();
        int diff = lenR - lenL;
        if (diff == 0 || diff == 1)
            return true;
        return false;
    }

    public boolean addLeftValue(Node node, int addVal) {
        if (node.getLChild() != null) {
            int ChildValue = this.getLChild().getValue();
            if ((ChildValue == addVal) || (ChildValue < addVal)) {

                this.addLeftValue(node.getLChild(), addVal);

            } else {
                addRightValue(addVal);
            }
        }

        else
            return true;
        return false;
    }

    public boolean addRightValue(int addVal) {
        return true;
    }

}

