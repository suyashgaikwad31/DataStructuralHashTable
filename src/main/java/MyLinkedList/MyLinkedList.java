package MyLinkedList;

import MyNode.INode;

public class MyLinkedList<K> {
    public INode tail;
    public INode head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode myNode) {
        if (this.tail == null) {
            this.tail = myNode;
        }
        if (this.head == null) {
            this.head = myNode;
        } else {
            INode tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    public void insert(INode myNode,INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getkey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getkey());
        System.out.println(myNodes);
    }


    public INode popLast() {
        INode temoNode = head;
        while (!temoNode.getNext().equals(tail)) {
            temoNode = temoNode.getNext();
        }
        this.tail = temoNode;
        temoNode = temoNode.getNext();
        return temoNode;
    }

    public <k> INode search(k key) {
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
        }
        this.head = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
}
