package MyNode;

public interface INode<k> {
    k getkey();
    void setkey(k key);

    INode getNext();
    void setNext(INode next);
}
