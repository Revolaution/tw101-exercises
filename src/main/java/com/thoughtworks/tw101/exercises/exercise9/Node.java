package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Node left;
    private Node right;
    private String name;
    private List<String> nameList;

    public Node(String name) {
        this.left = null;
        this.right = null;
        this.name = name;
        this.nameList = new ArrayList<String>();
    }

    public Node add(Node node, String nameOfNewNode) {
        if (node == null){
            node = new Node(nameOfNewNode);
        }
        else {
            if (nameOfNewNode.compareTo(node.name) <= 0) {
                node.left = add(node.left, nameOfNewNode);
            }
            else {
                node.right = add(node.right, nameOfNewNode);
            }
        }
        return node;
    }

    public List<String> names() {
        this.addNodesToList(this);
        return nameList;
    }


    public void addNodesToList(Node node) {
        if (node == null) {
            return;
        }
        addNodesToList(node.left);
        nameList.add(node.name);
        addNodesToList(node.right);
    }

}
