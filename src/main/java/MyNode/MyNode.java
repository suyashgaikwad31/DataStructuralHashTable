package MyNode;

public class MyNode<k> implements INode<k> {
    private  k key;
    private  INode next;

    public MyNode(k key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public k getkey() {
        return key;
    }

    @Override
    public void setkey(k key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}
