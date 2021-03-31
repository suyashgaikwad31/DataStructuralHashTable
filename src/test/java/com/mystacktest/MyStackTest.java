package com.mystacktest;


import MyNode.INode;
import MyNode.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {
    @Test
    public void given3NumberWhenAddedToStack_ShouldHaveAddedLastNode() {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode, peak);
    }

    @Test
    public void given3NumberInStackWhenPopedShouldMatchWithLastAddedNode () {
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, pop);
    }

}
