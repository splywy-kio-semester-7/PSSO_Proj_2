package com.company;

public class NumericNode implements TreeNode {

    public NumericNode(int val) {
        value = val;
    }

    public int getValue(){
        return value;
    }

    public String getLabel(){
        return (new Integer(value)).toString();
    }

    private int value;
}
