package com.mylinkedhashmaptest;

import MyLinkedList.MyLinkedList;

import com.myhashmaptest.MyMapNode;

import java.util.ArrayList;

public class MyLinkedHashMap<k, v> {
    private final int numBuckets;
    ArrayList<MyLinkedList<k>> myBucketArray;

    public MyLinkedHashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++)
            this.myBucketArray.add(null);
    }

    private int getBucketIndex(k key) {
        int hashcode = Math.abs(key.hashCode());
        int index = hashcode % numBuckets;
        System.out.println("key: "+key+" hashcode: "+hashcode+"index: "+index);
        return index;
    }

    public v get(k key) {
        int index = this.getBucketIndex(key);
        MyLinkedList<k> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) return null;
        MyMapNode<k, v> myMapNode = (MyMapNode<k, v>) myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getvalue();
    }


    public void add(k key, v value) {
        int index = this.getBucketIndex(key);
        MyLinkedList<k> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) {
            myLinkedList = new MyLinkedList<k>();
            this.myBucketArray.set(index, myLinkedList);
        }
        MyMapNode<k, v> myMapNode = (MyMapNode<k, v>) myLinkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyLinkedHashMap List {" + myBucketArray + '}';
    }
}
